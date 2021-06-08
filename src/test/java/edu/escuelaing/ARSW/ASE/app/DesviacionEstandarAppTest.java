package edu.escuelaing.ARSW.ASE.app;

import junit.framework.TestCase;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Pruebas unitarias DesviacionEstandar
 * @author BRAYAN JIMENEZ.
 */
public class DesviacionEstandarAppTest
    extends TestCase
{
    public DesviacionEstandarAppTest(String testName )
    {
        super( testName );
    }
    /**
     * @throws IOException
     */
    public void testMedia1() throws IOException {
        Double esperado=300696.44444444444;
        String ruta = new String("./src/test/java/edu/escuelaing/ARSW/ASE/app/resource/prueba2");
        ListaVinculada<Double> coleccion = CalcularDesviacionEstandar.contenido(ruta);
        Double obtenido= CalcularDesviacionEstandar.media(coleccion);
        assertEquals(esperado,obtenido);
    }
    /**
     * @throws IOException
     */
    public void testDesviacion1() throws IOException {
        Double esperado=1349.4421069464224;
        String ruta = new String("./src/test/java/edu/escuelaing/ARSW/ASE/app/resource/prueba1");
        ListaVinculada<Double> coleccion = CalcularDesviacionEstandar.contenido(ruta);
        Double obtenido= CalcularDesviacionEstandar.desviacionEstandar(coleccion);
        assertEquals(esperado,obtenido);
    }
    /**
     * @throws IOException
     */
    public void testNoArchivo() throws IOException {
        boolean thrown = false;
        try {
            String ruta = new String("./src/test/java/edu/escuelaing/ARSW/ASE/app/resource/sinArchivo");
            ListaVinculada<Double> coleccion = CalcularDesviacionEstandar.contenido(ruta);
            Double obtenido= CalcularDesviacionEstandar.desviacionEstandar(coleccion);
        } catch (FileNotFoundException e) {
            thrown = true;
        }
        assertTrue(thrown);
    }
    /**
     * @throws IOException
     */
    public void testArchivoMal() throws IOException {
        boolean thrown = true;
        try {
            String ruta = new String("./src/test/java/edu/escuelaing/ARSW/ASE/app/resource/prueba1");
            ListaVinculada<Double> coleccion = CalcularDesviacionEstandar.contenido(ruta);
            Double obtenido= CalcularDesviacionEstandar.desviacionEstandar(coleccion);
        } catch (FileNotFoundException e) {
            thrown = false;
        }
        assertTrue(thrown);
    }
    /**
     * @throws IOException
     */
    public void testMediaTabla1Columna1() throws IOException {
        Double esperado=550.6;
        String ruta = new String("./src/test/java/edu/escuelaing/ARSW/ASE/app/resource/tabla1-columna1");
        ListaVinculada<Double> coleccion = CalcularDesviacionEstandar.contenido(ruta);
        Double obtenido= CalcularDesviacionEstandar.media(coleccion);
        assertEquals(esperado,obtenido);
    }
    /**
     * @throws IOException
     */
    public void testMediaTabla1Columna2() throws IOException {
        Double esperado=60.32000000000001;
        String ruta = new String("./src/test/java/edu/escuelaing/ARSW/ASE/app/resource/tabla1-columna2");
        ListaVinculada<Double> coleccion = CalcularDesviacionEstandar.contenido(ruta);
        Double obtenido= CalcularDesviacionEstandar.media(coleccion);
        assertEquals(esperado,obtenido);
    }
    /**
     * @throws IOException
     */
    public void testDesviacionTabla1Colmuna2() throws IOException {
        Double esperado=62.25583060601187;
        String ruta = new String("./src/test/java/edu/escuelaing/ARSW/ASE/app/resource/tabla1-columna2");
        ListaVinculada<Double> coleccion = CalcularDesviacionEstandar.contenido(ruta);
        Double obtenido= CalcularDesviacionEstandar.desviacionEstandar(coleccion);
        assertEquals(esperado,obtenido);
    }
}
