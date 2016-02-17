package gui.applet;

import gui.FondoDesktop;
import javax.swing.JApplet;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author David López González
 */
public class AppletPrincipal extends JApplet
{

    JDesktopPane escritorio;

    public void init()
    {
        escritorio = new JDesktopPane();
        escritorio.setBorder(new FondoDesktop());
        add(escritorio);

        JMenuBar barra = new JMenuBar();
        JMenu archivo = new JMenu("Menú");
        JMenuItem finca = new JMenuItem("Finca");
        JMenuItem parcela = new JMenuItem("Parcela");
        JMenuItem tipoProducto = new JMenuItem("Tipo Producto");
        JMenuItem variedad = new JMenuItem("Variedad");
        JMenuItem cultivar = new JMenuItem("Cultivar");
        JMenuItem ingresoVenta = new JMenuItem("Ingreso Venta");
        JMenuItem ingresoOtro = new JMenuItem("Ingreso Otro");
        JMenuItem trabajador = new JMenuItem("Trabajador");
        JMenuItem gastoManoObra = new JMenuItem("Gasto de Mano Obra");
        JMenuItem gastoProducto = new JMenuItem("Gasto Producto");
        JMenuItem gastoOtro = new JMenuItem("Gasto Otro");

        barra.add(archivo);
        setJMenuBar(barra);

        archivo.add(finca);
        archivo.add(parcela);
        archivo.add(tipoProducto);
        archivo.add(variedad);
        archivo.add(cultivar);
        archivo.add(ingresoVenta);
        archivo.add(ingresoOtro);
        archivo.add(trabajador);
        archivo.add(gastoManoObra);
        archivo.add(gastoProducto);
        archivo.add(gastoOtro);
    }

}
