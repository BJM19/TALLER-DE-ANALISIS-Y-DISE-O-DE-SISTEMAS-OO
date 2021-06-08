package edu.escuelaing.ARSW.ASE.app;
import java.lang.Math;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Math.sqrt;


/**
 *
 * @author BRAYAN JIMÉNEZ
 */
public class CalcularDesviacionEstandar {
     public static ListaVinculada<Double> contenido(String archivo) throws IOException {
        ListaVinculada<String> coleccion = new ListaVinculada<>();
        String cadena;
        FileReader fileReader = new FileReader(archivo);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while((cadena = bufferedReader.readLine())!=null && !cadena.isEmpty()) {
            if (cadena.startsWith("1") || cadena.startsWith("2") || cadena.startsWith("3") || cadena.startsWith("4") || cadena.startsWith("5") || cadena.startsWith("6") || cadena.startsWith("7") || cadena.startsWith("8") || cadena.startsWith("9") || cadena.startsWith("0")) {
                coleccion.add(cadena);
            }
        }
        bufferedReader.close();
        ListaVinculada<Double> coleccionD =stringtodoublearray(coleccion);
        return coleccionD;
    }

    /**
     * Metodo para obtener una lista vinculada a partir de una lista de stings
     * @param coleccion Lista Vinculada String
     * @return coleccion
     */
    public static ListaVinculada<Double> stringtodoublearray(ListaVinculada<String> coleccion){
        ListaVinculada<Double> coleccionD = new ListaVinculada<>();
        for (String dato : coleccion) {
            coleccionD.add(Double.parseDouble(dato));
        }
        return coleccionD;
    }
    /**
     * Metodo para sumar los elementos de una coleccion
     */
    public static Double sumarColeccion(ListaVinculada<Double> coleccionStrings) {
        double acumulador=0.0;
        for (Double dato : coleccionStrings) {
            acumulador =acumulador+dato;
        }
        return acumulador;
    }
    /**
     * calcular la Media de numeros tomados de un archivo
     */
    public static Double media(ListaVinculada<Double> coleccion){
       Double media = sumarColeccion(coleccion) /(double) coleccion.size();
        return media;
    }
    /**
     *
     * @param coleccion coleccion con la cual se calcula la desviacion estandar
     * @return
     */
    public static Double desviacionEstandar(ListaVinculada<Double> coleccion) {
        ListaVinculada<Double> arrayresultado = new ListaVinculada<>();
        Double xavg = media(coleccion);
        for (Double i : coleccion) {
            arrayresultado.add(Math.pow(i - xavg, 2));
        }
        return sqrt((sumarColeccion(arrayresultado) / (coleccion.size() - 1)));
    }
}


