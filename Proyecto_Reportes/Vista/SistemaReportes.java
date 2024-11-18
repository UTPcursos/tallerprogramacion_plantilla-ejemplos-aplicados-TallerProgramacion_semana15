package Proyecto_Reportes.Vista;

import java.util.Scanner;

import Proyecto_Reportes.Controlador.CargaAlumnos;
import Proyecto_Reportes.Controlador.CargaCursos;
import Proyecto_Reportes.Controlador.CargaDatos;
import Proyecto_Reportes.Controlador.CargaNotas;

public class SistemaReportes {
    public static void main(String[] args) {
        cargarDatos();
        Scanner lector = new Scanner(System.in);
        int opcion1 = 0;
        int opcion2 = 0;
        do{
            menu1();
            opcion1 = lector.nextInt();
            switch(opcion1){
                case 1:
                    do{
                        menu2();
                        opcion2 = lector.nextInt();
                        switch(opcion2){
                            case 1:
                                break;
                            case 2:
                                break;
                        }
                    }while(opcion2 != 3);
                    break;
                case 2:
                    do{
                        menu2();
                        opcion2 = lector.nextInt();
                        switch(opcion2){
                            case 1:
                                break;
                            case 2:
                                break;
                        }
                    }while(opcion2 != 3);
                    break;
                case 3:
                    do{
                        menu2();
                        opcion2 = lector.nextInt();
                        switch(opcion2){
                            case 1:
                                break;
                            case 2:
                                break;
                        }
                    }while(opcion2 != 3);
                    break;
                case 4:
                    do{
                        menu2();
                        opcion2 = lector.nextInt();
                        switch(opcion2){
                            case 1:
                                break;
                            case 2:
                                break;
                        }
                    }while(opcion2 != 3);
                    break;
                case 5:
                    do{
                        menu2();
                        opcion2 = lector.nextInt();
                        switch(opcion2){
                            case 1:
                                break;
                            case 2:
                                break;
                        }
                    }while(opcion2 != 3);
                    break;
                case 6:
                    do{
                        menu2();
                        opcion2 = lector.nextInt();
                        switch(opcion2){
                            case 1:
                                break;
                            case 2:
                                break;
                        }
                    }while(opcion2 != 3);
                    break;
                case 7:
                    do{
                        menu2();
                        opcion2 = lector.nextInt();
                        switch(opcion2){
                            case 1:
                                break;
                            case 2:
                                break;
                        }
                    }while(opcion2 != 3);
                    break;
                case 8:
                    do{
                        menu2();
                        opcion2 = lector.nextInt();
                        switch(opcion2){
                            case 1:
                                break;
                            case 2:
                                break;
                        }
                    }while(opcion2 != 3);
                    break;
                case 9:
                    do{
                        menu2();
                        opcion2 = lector.nextInt();
                        switch(opcion2){
                            case 1:
                                break;
                            case 2:
                                break;
                        }
                    }while(opcion2 != 3);
                    break;
                }
            }while(opcion1 != 10);
    }

    public static void cargarDatos(){
        CargaDatos.agregarDatos();
        CargaDatos.ordenarCodigo();
        CargaCursos.CargarCursos();
        CargaAlumnos.CargarAlumnos();
        CargaNotas.cargarNotas();
    }

    public static void menu1(){
        System.out.println("Menu de opciones");
        System.out.println("1. Reporte de notas por curso");
        System.out.println("2. Reporte de notas por alumno");
        System.out.println("3. Reporte de notas por curso y alumno");
        System.out.println("4. Reporte de notas por curso y promedio");
        System.out.println("5. Reporte de notas por curso y promedio general");
        System.out.println("6. Reporte de notas por curso y promedio general de aprobados");
        System.out.println("7. Reporte de notas por curso y promedio general de desaprobados");
        System.out.println("8. Reporte de notas por curso y promedio general de aprobados y desaprobados");
        System.out.println("9. Reporte de notas por curso y promedio general de aprobados y desaprobados con porcentaje");
        System.out.println("10. Salir");
        System.out.println("Ingrese una opcion: ");
    }
    public static void menu2(){
        System.out.println("Sub-Menu de opciones");
        System.out.println("1. En pantalla");
        System.out.println("2. Exportar a archivo");
        System.out.println("2. atras");
        System.out.println("Ingrese una opcion: ");
    }
}
