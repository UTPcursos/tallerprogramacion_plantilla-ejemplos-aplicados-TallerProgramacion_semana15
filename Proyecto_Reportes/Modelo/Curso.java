package Proyecto_Reportes.Modelo;

public class Curso{
    private String nombreCurso;

    public Curso(String nombreCurso){
        this.nombreCurso = nombreCurso;
    }

    public String getNombreCurso(){
        return nombreCurso;
    }
    public void setNombreCurso(String nombreCurso){
        this.nombreCurso = nombreCurso;
    }

    @Override
    public String toString(){
        return "Curso{" + "nombreCurso=" + nombreCurso + '}';
    }
}