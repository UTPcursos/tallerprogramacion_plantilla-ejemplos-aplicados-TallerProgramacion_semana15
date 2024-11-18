package Proyecto_Reportes.Modelo;

public class Alumno{
    private String nombres;
    private String apellidos;
    private String codigo;

    
    public Alumno(String nombres, String apellidos, String codigo){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codigo = codigo;
    }

    public String getNombres(){
        return nombres;
    }
    public String getApellidos(){
        return apellidos;
    }
    public String getCodigo(){
        return codigo;
    }

    public void setNombres(String nombres){
        this.nombres = nombres;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    @Override
    public String toString(){
        return "Alumno{" + "nombres=" + nombres + ", apellidos=" + apellidos + ", codigo=" + codigo + '}';
    }

}