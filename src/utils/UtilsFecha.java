package utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author David López González
 */
public class UtilsFecha
{

    /**
     * Método que establece el mes pasado como parámetro
     *
     * @param fecha 1-->Enero, 2-->Febrero ....
     * @param numeroMes
     * @return
     */
    public static Calendar CambiarMes(Calendar fecha, int numeroMes)
    {
        fecha.set(Calendar.MONTH, numeroMes - 1);
        return fecha;
    }

     public static String formatearFechas(Date fecha)
    {
        return formatearFechas(fecha, "yyyy-MM-dd");
    }

    public static String formatearFechas(Date fecha, String formatoFechaVisualizar)
    {
        SimpleDateFormat formatoFecha = new SimpleDateFormat(formatoFechaVisualizar);
        return formatoFecha.format(fecha);
    }

    public static String formatearFechas(Calendar fecha)
    {
        return formatearFechas(fecha, "yyyy-MM-dd");
    }

    public static String formatearFechas(Calendar fecha, String formatoFechaVisualizar)
    {
        SimpleDateFormat formatoFecha = new SimpleDateFormat(formatoFechaVisualizar);
        return formatoFecha.format(fecha.getTime());
    }

    public static boolean comprobarFechas(Date fechaInicio, Date fechaFin)
    {
        if (fechaInicio.after(fechaFin))    //las fechas no están bien introdcidas
        {
            return false;
        }
        return true;
    }

    public static boolean comprobarFechas(Calendar fechaInicio, Calendar fechaFin)
    {
        if (fechaInicio.after(fechaFin))    //las fechas no están bien introdcidas
        {
            return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Date f1 = new Date(0, 0, 1);
        // primer día 1900-01-01 = Date(0, 0, 1);
        Date f2 = new Date(0, 1, 1);
        System.out.println("Fecha sin formatear (Date):\t " + f1);
        System.out.println("Fecha formateada    (Date):\t " + formatearFechas(f1));
        System.out.println("Fecha 1 antes que fecha 2:\t " + comprobarFechas(f1, f2));
        System.out.println("Fecha 2 antes que fecha 1:\t " + comprobarFechas(f2, f1));

        System.out.println("");
        System.out.println("Fecha sin formatear (GregorianCalendar):\t " + new GregorianCalendar());
        System.out.println("Fecha formateada    (GregorianCalendar):\t " + formatearFechas(new GregorianCalendar()));

        System.out.println("");
        Calendar c1 = new GregorianCalendar();
        System.out.println("Fecha sin formatear (Calendar):\t " + c1);
        System.out.println("Fecha formateada    (Calendar):\t " + formatearFechas(c1));
        System.out.println("");
        System.out.println(formatearFechas(CambiarMes(c1, 1)));
    }
}
