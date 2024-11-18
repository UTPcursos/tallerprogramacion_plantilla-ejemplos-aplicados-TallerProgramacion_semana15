package Proyecto_Reportes.Controlador;

import Proyecto_Reportes.Modelo.Curso;

public class CargaCursos {
    public static final int FACTOR_CRECIMIENTO = 10;
    public static Curso[] cursos = new Curso[FACTOR_CRECIMIENTO];
    public static int contadorCursos = 0;


    public static Curso[] getCursos(){
        return cursos;
    }

    public static Curso buscarCurso(String nombreCurso){
        for(int i = 0; i < contadorCursos; i++){
            if(cursos[i].getNombreCurso().equals(nombreCurso)){
                return cursos[i];
            }
        }
        return null;
    }
    
    public static void CargarCursos(){
        String[] temporal = new String[CargaDatos.getDatos().length];
        for(int i = 0; i < CargaDatos.getDatos().length; i++){
            if(CargaDatos.getDatos()[i] == null){
                break;
            }
            String curso = CargaDatos.getDatos()[i].getCurso();
            boolean existe = false;
            for(int j = 0; j < contadorCursos; j++){
                if(cursos[j].getNombreCurso().equals(curso)){
                    existe = true;
                    break;
                }
            }
            if(!existe){
                if(contadorCursos == cursos.length){
                    Curso[] aux = new Curso[cursos.length + FACTOR_CRECIMIENTO];
                    System.arraycopy(cursos, 0, aux, 0, cursos.length);
                    cursos = aux;
                }
                cursos[contadorCursos] = new Curso(curso);
                contadorCursos++;
            }
        }
    }

    public static void imprimirCursos(){
        for(int i = 0; i < contadorCursos; i++){
            System.out.println(cursos[i]);
        }
    }
}
