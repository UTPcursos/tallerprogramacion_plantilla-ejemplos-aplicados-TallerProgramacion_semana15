package Proyecto_Reportes.Modelo;

public class Dato {
    private String curso;
    private String nombres;
    private String apellidos;
    private String codigo;
    private double pc1;
    private double pc2;
    private double pc3;
    private double pa;
    private double ef;
    private double pf;

    public Dato(String curso, String nombres, String apellidos, String codigo, double pc1, double pc2, double pc3, double pa, double ef, double pf) {
        this.curso = curso;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codigo = codigo;
        this.pc1 = pc1;
        this.pc2 = pc2;
        this.pc3 = pc3;
        this.pa = pa;
        this.ef = ef;
        this.pf = pf;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getPc1() {
        return pc1;
    }

    public void setPc1(double pc1) {
        this.pc1 = pc1;
    }

    public double getPc2() {
        return pc2;
    }

    public void setPc2(double pc2) {
        this.pc2 = pc2;
    }

    public double getPc3() {
        return pc3;
    }

    public void setPc3(double pc3) {
        this.pc3 = pc3;
    }

    public double getPa() {
        return pa;
    }

    public void setPa(double pa) {
        this.pa = pa;
    }

    public double getEf() {
        return ef;
    }

    public void setEf(double ef) {
        this.ef = ef;
    }

    public double getPf() {
        return pf;
    }

    public void setPf(double pf) {
        this.pf = pf;
    }

    @Override
    public String toString() {
        return "Datos{" + "nombres=" + nombres + ", apellidos=" + apellidos + ", codigo=" + codigo + ", curso=" + curso + ", pc1=" + pc1 + ", pc2=" + pc2 + ", pc3=" + pc3 + ", pa=" + pa + ", ef=" + ef + ", pf=" + pf + '}';
    }
}