package edu.escuelaing.ARSW.ASE.app;

import java.io.*;

/**
 *
 * @author BRAYAN JIMÉNEZ
 *
 */
public class DesviacionEstandarApp
{
    public static void main( String[] args ) throws IOException {
        String nombreArchivo = args[0];
        ListaVinculada<Double> coleccion = (CalcularDesviacionEstandar.contenido(nombreArchivo));
        System.out.println("La desviación estandar es: "+ CalcularDesviacionEstandar.desviacionEstandar(coleccion));
        System.out.println("La media es : "+ CalcularDesviacionEstandar.media(coleccion));
    }
}

