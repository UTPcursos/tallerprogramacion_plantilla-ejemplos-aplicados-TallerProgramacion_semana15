package Proyecto_Reportes.Controlador;

import Proyecto_Reportes.Modelo.Nota;

public class CargaNotas {
    private static final int FACTOR_CRECIMIENTO = 10;
    private static Nota[] notas= new Nota[FACTOR_CRECIMIENTO];
    private static int contadorNotas = 0;

    public static Nota[] getNotas(){
        return notas;
    }

    public static void cargarNotas(){
        for(int i = 0; i < CargaDatos.getDatos().length; i++){
            if(CargaDatos.getDatos()[i] == null){
                break;
            }
            String curso = CargaDatos.getDatos()[i].getCurso();
            String nombres = CargaDatos.getDatos()[i].getNombres();
            String apellidos = CargaDatos.getDatos()[i].getApellidos();
            String codigo = CargaDatos.getDatos()[i].getCodigo();
            double pc1 = CargaDatos.getDatos()[i].getPc1();
            double pc2 = CargaDatos.getDatos()[i].getPc2();
            double pc3 = CargaDatos.getDatos()[i].getPc3();
            double pa = CargaDatos.getDatos()[i].getPa();
            double ef = CargaDatos.getDatos()[i].getEf();
            double pf = CargaDatos.getDatos()[i].getPf();

            Nota nota = new Nota(CargaAlumnos.buscarAlumno(codigo), CargaCursos.buscarCurso(curso), pc1, pc2, pc3, pa, ef, pf);
            if(contadorNotas == notas.length){
                Nota[] aux = new Nota[notas.length + FACTOR_CRECIMIENTO];
                System.arraycopy(notas, 0, aux, 0, notas.length);
                notas = aux;
            }
            notas[contadorNotas] = nota;
            contadorNotas++;
        }
    }

    public static void imprimirNotas(){
        for(int i = 0; i < contadorNotas; i++){
            System.out.println(notas[i]);
        }
    }
}
