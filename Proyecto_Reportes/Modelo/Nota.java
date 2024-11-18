package Proyecto_Reportes.Modelo;

public class Nota {
    private  Alumno alumno;
    private Curso curso;
    private double pc1;
    private double pc2;
    private double pc3;
    private double pa;
    private double ef;
    private double pf;
    

    public Nota(Alumno alumno, Curso curso, double pc1, double pc2, double pc3, double pa, double ef, double pf) {
        this.alumno = alumno;
        this.curso = curso;
        this.pc1 = pc1;
        this.pc2 = pc2;
        this.pc3 = pc3;
        this.pa = pa;
        this.ef = ef;
        this.pf = pc1*0.15 + pc2*0.15 + pc3*0.15 + pa*0.15 + ef*0.4;
    }
    
    public Alumno getAlumno() {
        return alumno;
    }
    private void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    public Curso getCurso() {
        return curso;
    }
    private void setCurso(Curso curso) {
        this.curso = curso;
    }
    public double getPc1() {
        return pc1;
    }
    private void setPc1(double pc1) {
        this.pc1 = pc1;
    }
    public double getPc2() {
        return pc2;
    }
    private void setPc2(double pc2) {
        this.pc2 = pc2;
    }
    public double getPc3() {
        return pc3;
    }
    private void setPc3(double pc3) {
        this.pc3 = pc3;
    }
    public double getPa() {
        return pa;
    }
    private void setPa(double pa) {
        this.pa = pa;
    }
    public double getEf() {
        return ef;
    }
    private void setEf(double ef) {
        this.ef = ef;
    }
    public double getPf() {
        return pf;
    }

    @Override
    public String toString() {
        return "Nota{" + "alumno=" + alumno.toString() + ", curso=" + curso.toString() + ", pc1=" + pc1 + ", pc2=" + pc2 + ", pc3=" + pc3 + ", pa=" + pa + ", ef=" + ef + ", pf=" + pf + '}';
    }
}