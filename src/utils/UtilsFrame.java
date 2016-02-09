package utils;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 * Clase usada para facilitar la disposición de los formularios
 *
 * @author David López González
 */
public class UtilsFrame
{

    /**
     * Método que sirve para centrar el JInternalFrame, siendo tanto de ancho
     * como de alto de 400
     *
     * @param jiframe
     */
    public static void centrar(JInternalFrame jiframe)
    {
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension resolucion = miPantalla.getScreenSize();
        int altura = resolucion.height;
        int anchura = resolucion.width;
        int tamano = 400;
        jiframe.setBounds((anchura - tamano) / 2, ((altura - tamano) / 2) - 200,
                tamano, tamano);
        jiframe.toFront();
    }

    /**
     * Método que sirve para centrar el JInternalFrame, pasando el tamaño
     *
     * @param jiframe
     * @param tamano
     */
    public static void centrar(JInternalFrame jiframe, int tamano)
    {
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension resolucion = miPantalla.getScreenSize();
        int altura = resolucion.height;
        int anchura = resolucion.width;
        jiframe.setBounds((anchura - tamano) / 2, ((altura - tamano) / 2) - 200, tamano, tamano);
        jiframe.toFront();
    }

    /**
     * Método que sirve para centrar el JInternalFrame, pasando el ancho y el
     * alto del frame
     *
     * @param jiframe
     * @param anchoFrame
     * @param altoFrame
     */
    public static void centrar(JInternalFrame jiframe, int anchoFrame, int altoFrame)
    {
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension resolucion = miPantalla.getScreenSize();
        int altura = resolucion.height;
        int anchura = resolucion.width;
        jiframe.setBounds((anchura - anchoFrame) / 2,
                ((altura - altoFrame) / 2) - 200, anchoFrame, altoFrame);
        jiframe.toFront();
    }

    /**
     * Método que sirve para centrar el JFrame, pasando el ancho y el alto del
     * frame
     *
     * @param jframe
     * @param anchoFrame
     * @param altoFrame
     */
    public static void centrar(JFrame jframe, int anchoFrame, int altoFrame)
    {
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension resolucion = miPantalla.getScreenSize();
        int altura = resolucion.height;
        int anchura = resolucion.width;
        jframe.setBounds((anchura - anchoFrame) / 2,
                ((altura - altoFrame) / 2) - 200, anchoFrame, altoFrame);
        jframe.toFront();
    }
}
