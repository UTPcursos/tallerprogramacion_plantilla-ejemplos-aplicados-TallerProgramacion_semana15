package Proyecto_Reportes.Vista;

import Proyecto_Reportes.Controlador.CargaAlumnos;
import Proyecto_Reportes.Controlador.CargaCursos;
import Proyecto_Reportes.Controlador.CargaDatos;
import Proyecto_Reportes.Controlador.CargaNotas;
import Proyecto_Reportes.Controlador.ReporteNotasCurso;

public class TestReportes {
    public static void main(String[] args) {
        // TODO code application logic here
        CargaDatos.agregarDatos();
        //CargaDatos.ImprimirDatos();
        CargaDatos.ordenarCodigo();
        CargaCursos.CargarCursos();
        //CargaCursos.imprimirCursos();
        CargaAlumnos.CargarAlumnos();
        //CargaAlumnos.imprimirAlumnos();
        CargaNotas.cargarNotas();
        //CargaNotas.imprimirNotas();

        System.out.println(ReporteNotasCurso.generarReporteNotasCurso());
        ReporteNotasCurso.ExportarTxt();
    }
}