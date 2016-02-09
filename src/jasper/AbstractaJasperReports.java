/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasper;

import com.mysql.jdbc.Connection;
import java.util.Map;
import javax.swing.JFileChooser;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author David López González
 */
public abstract class AbstractaJasperReports
{

    /**
     * reporte como tal del sistema de archivos
     */
    private static JasperReport report;

    /**
     * reporte, pero ya lleno con la información que trae el query interno
     */
    private static JasperPrint reportFilled;

    /**
     * visor donde se va a mostrar el reporte
     */
    private static JasperViewer viewer;

    /**
     * método para crear el informe
     *
     * @param conexion
     * @param ruta
     */
    public static void crearInforme(Connection conexion, String ruta)
    {
        try
        {
            report = (JasperReport) JRLoader.loadObjectFromFile(ruta);
            reportFilled = JasperFillManager.fillReport(report, null, conexion);
        } catch (JRException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Método para crear el informe 
     * 
     * @param conexion  enlace con la BBDD
     * @param ruta      localización del informe.jasper
     * @param parametros Clave/valor que usará el informe para obtener los datos
     */
    public static void crearInforme(Connection conexion, String ruta, Map parametros)
    {
        try
        {
            report = (JasperReport) JRLoader.loadObjectFromFile(ruta);
            reportFilled = JasperFillManager.fillReport(report, parametros, conexion);
        } catch (JRException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * método para visualizar en el visor propio de JasperReport
     */
    public static void verVisor()
    {
        viewer = new JasperViewer(reportFilled, false);
        //http://www.forosdelweb.com/f45/ireport-cierra-ventanas-mi-aplicacion-549105/#post2252840
        //solucion a que se cierre el programa al cerrar el visor
        viewer.setVisible(true);
    }

    /**
     * método para exportar a PDF en una determinada ruta
     *
     * @param ruta
     */
    public static void exportarPDF(String ruta)
    {
        try
        {
            JasperExportManager.exportReportToPdfFile(reportFilled, ruta);
        } catch (JRException ex)
        {
            ex.printStackTrace();
        }
    }

    /**
     * método para exportar a PDF en una determinada ruta
     */
    public static void exportarPDF()
    {
        JFileChooser jfc = new JFileChooser();
        String ruta = "";
        try
        {
            if (jfc.showSaveDialog(null) == jfc.APPROVE_OPTION)
            {
                ruta = jfc.getSelectedFile().getAbsolutePath();
                System.out.println(ruta);
                exportarPDF(ruta);
            }
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

}
