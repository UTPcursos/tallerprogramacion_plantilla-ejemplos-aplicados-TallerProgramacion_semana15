package Proyecto_Reportes.Controlador;
import java.io.FileWriter;
import java.io.IOException;
public class ReporteNotasCurso {
    public static String generarReporteNotasCurso() {
        String reporte="";
        for (int i=0;i<CargaCursos.getCursos().length;i++) {
            if(CargaCursos.getCursos()[i] == null){
                break;
            }
            reporte += "Curso: " + CargaCursos.getCursos()[i].getNombreCurso() ;
            double promedio = 0;
            int contador=0;
            for (int j=0;j<CargaNotas.getNotas().length;j++) {
                if(CargaNotas.getNotas()[j] == null){
                    break;
                }
                if(CargaNotas.getNotas()[j].getCurso().getNombreCurso().equals(CargaCursos.getCursos()[i].getNombreCurso())){
                    promedio += CargaNotas.getNotas()[j].getPf();
                    contador++;
                }
            }
            
            promedio = promedio / contador;
            reporte += "Promedio: " + (Math.round(promedio))+"\n";
        }

        return reporte;
    }

    public static void ExportarTxt(){
        String reporte = generarReporteNotasCurso();
        try {
            FileWriter myWriter = new FileWriter("ReporteNotasCurso.txt");
            myWriter.write(reporte);
            myWriter.close();
            System.out.println("Reporte exportado con éxito.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();}
        }
}
