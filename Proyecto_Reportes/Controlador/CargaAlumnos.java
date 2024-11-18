package Proyecto_Reportes.Controlador;

import Proyecto_Reportes.Modelo.Alumno;

public class CargaAlumnos {
    private static final int FACTOR_CRECIMIENTO = 10;
    private static Alumno[] alumnos = new Alumno[FACTOR_CRECIMIENTO];
    private static int contadorAlumnos = 0;

    public static Alumno[] getAlumnos(){
        return alumnos;
    }

    public static Alumno buscarAlumno(String codigo){
        for(int i = 0; i < contadorAlumnos; i++){
            if(alumnos[i].getCodigo().equals(codigo)){
                return alumnos[i];
            }
        }
        return null;
    }

    public static void CargarAlumnos(){
        Alumno[] temporal = new Alumno[CargaDatos.getDatos().length];
        for(int i = 0; i < CargaDatos.getDatos().length; i++){
            if(CargaDatos.getDatos()[i] == null){
                break;
            }
            String alumno = CargaDatos.getDatos()[i].getNombres() + " " + CargaDatos.getDatos()[i].getApellidos();
            boolean existe = false;
            for(int j = 0; j < contadorAlumnos; j++){
                if(alumnos[j].equals(alumno)){
                    existe = true;
                    break;
                }
            }
            if(!existe){
                if(contadorAlumnos == alumnos.length){
                    Alumno[] aux = new Alumno[alumnos.length + FACTOR_CRECIMIENTO];
                    System.arraycopy(alumnos, 0, aux, 0, alumnos.length);
                    alumnos = aux;
                }
                alumnos[contadorAlumnos] = new Alumno(CargaDatos.getDatos()[i].getNombres(),CargaDatos.getDatos()[i].getApellidos(),CargaDatos.getDatos()[i].getCodigo());
                contadorAlumnos++;
            }
        }
    }

    public static void imprimirAlumnos(){
        for(int i = 0; i < contadorAlumnos; i++){
            System.out.println(alumnos[i].toString());
        }
    }
}
