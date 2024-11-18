    package Proyecto_Reportes.Controlador;

    import Proyecto_Reportes.Modelo.Dato;
    import java.io.File;
    import java.io.FileReader;
    import java.io.BufferedReader;

    public class CargaDatos{
        private static final int FACTOR_CRECIMIENTO = 10;
        private static Dato[] datos= new Dato[FACTOR_CRECIMIENTO];
        private static int contadorDatos = 0;

        public static Dato[] getDatos(){
            return datos;
        }
        public static void agregarDatos(){
            try{
                File archivo = new File("notasAlumnos.csv");
                System.out.println(archivo.getAbsolutePath());
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                int contador=0;
                String linea;
                while((linea = br.readLine()) != null){
                    if (contador == 0){
                        contador++;
                        continue;
                    }
                    String[] datosLinea = linea.split(",");
                    String curso = datosLinea[0];
                    String nombres = datosLinea[1];
                    String apellidos = datosLinea[2];
                    String codigo = datosLinea[3];
                    double pc1 = Double.parseDouble(datosLinea[4]);
                    double pc2 = Double.parseDouble(datosLinea[5]);
                    double pc3 = Double.parseDouble(datosLinea[6]);
                    double pa = Double.parseDouble(datosLinea[7]);
                    double ef = Double.parseDouble(datosLinea[8]);
                    double pf = Double.parseDouble(datosLinea[9]);

                    Dato dato = new Dato(curso,nombres, apellidos, codigo,  pc1, pc2, pc3, pa, ef, pf);
                    if(contadorDatos == datos.length){
                        Dato[] aux = new Dato[datos.length + FACTOR_CRECIMIENTO];
                        System.arraycopy(datos, 0, aux, 0, datos.length);
                        datos = aux;
                    }
                    datos[contadorDatos] = dato;
                    contadorDatos++;
                }
                br.close();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println("Error al cargar los datos");
            }

        }

        public static void ImprimirDatos(){
            for(int i = 0; i < contadorDatos; i++){
                System.out.println(datos[i]);
            }
        }

        public static void ordenarCodigo(){
            for(int i = 0; i < contadorDatos; i++){
                for(int j = 0; j < contadorDatos - 1; j++){
                    if(datos[j].getCodigo().compareTo(datos[j+1].getCodigo()) > 0){
                        Dato aux = datos[j];
                        datos[j] = datos[j+1];
                        datos[j+1] = aux;
                    }
                }
            }
        }

    }