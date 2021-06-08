package edu.escuelaing.ARSW.ASE.app;

import java.io.*;

/**
 * Lectura de archivos
 *
 * Autor: BRAYAN JIMÉNEZ
 */
public class Lectora {
    public static ListaVinculada<Double> lector(String file) {
        ListaVinculada<Double> valores = new ListaVinculada<Double>();
        try {
            File f = new File(file);
            FileReader fr = new FileReader(f);
            BufferedReader bf = new BufferedReader(fr);
            String cadena;
            cadena = bf.readLine();
            int cantidad = Integer.parseInt(cadena);
            for (int i = 0; i < cantidad; i++) {
                cadena = bf.readLine();
                Double temp = Double.parseDouble(cadena);
                valores.add(temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return valores;
    }
}

