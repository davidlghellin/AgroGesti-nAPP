package utils;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JInternalFrame;

/**
 *
 * @author david
 */
public class UtilsFrame
{
	/**
	 * Método que sirve para centrar el JInternalFrame, siendo tanto de ancho como de
	 * alto de 400
	 * 
	 * @param jframe
	 */
	public static void centrar(JInternalFrame jframe)
	{
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension resolucion = miPantalla.getScreenSize();
		int altura = resolucion.height;
		int anchura = resolucion.width;
		int tamano = 400;
		jframe.setBounds((anchura - tamano) / 2, ((altura - tamano) / 2)-200,
				tamano, tamano);
	}

	/**
	 * Método que sirve para centrar el JInternalFrame, pasando el tamaño
	 * 
	 * @param jframe
	 * @param tamano = ancho y alto
	 */
	public static void centrar(JInternalFrame jframe, int tamano)
	{
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension resolucion = miPantalla.getScreenSize();
		int altura = resolucion.height;
		int anchura = resolucion.width;
		jframe.setBounds((anchura - tamano) / 2, ((altura - tamano) / 2)-200, tamano, tamano);
	}

	/**
	 * Método que sirve para centrar el JInternalFrame, pasando el ancho y el alto del frame 
	 * 
	 * @param jframe
	 * @param anchoFrame
	 * @param altoFrame
	 */
	public static void centrar(JInternalFrame jframe, int anchoFrame, int altoFrame)
	{
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension resolucion = miPantalla.getScreenSize();
		int altura = resolucion.height;
		int anchura = resolucion.width;
		jframe.setBounds((anchura - anchoFrame) / 2,
				((altura - altoFrame) / 2)-200, anchoFrame, altoFrame);
	}
}
