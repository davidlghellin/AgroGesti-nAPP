/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import conexion.ConexionBBDD;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class Utilidades
{

    public static JTable rellenarJTable(String consulta, JTable table) throws ClassNotFoundException, SQLException, Exception
    {
        JTable jtable = table;
        ConexionBBDD c = new ConexionBBDD();
        ResultSet rs = c.hacerConsulta(consulta);
        DefaultTableModel modelo = (DefaultTableModel) jtable.getModel();
        ResultSetMetaData rsmd = rs.getMetaData();

        int cantidadColumnas = rsmd.getColumnCount();
        modelo.setColumnCount(0);
        modelo.setRowCount(0);
        for (int i = 1; i <= cantidadColumnas; i++)
        {
            modelo.addColumn(rsmd.getColumnLabel(i));
        }
        while (rs.next())
        {
            Object[] fila = new Object[cantidadColumnas];
            for (int i = 0; i < cantidadColumnas; i++)
            {
                fila[i] = rs.getObject(i + 1);
            }
            modelo.addRow(fila);
        }
        rs.close();
        c.cerrarConexion();
        return jtable;
    }

    /**
     * Método genérico para borrar el elemento selecionado del jtable
     *
     * @param nombreTabla Nombre de la tabla en el base de datos
     * @param table JTable donde se visualizará los datos
     * @throws Exception
     */
    public static void borrar(String nombreTabla, JTable table) throws Exception
    {
        JTable jtable = table;
        ConexionBBDD c = new ConexionBBDD();
        String SQLConsulta = "SELECT * FROM " + nombreTabla + ";";
        ResultSet rs = c.hacerConsulta(SQLConsulta);
        ResultSetMetaData rsmd = rs.getMetaData();
        String id = null;
        try
        {
            id = (String) jtable.getValueAt(jtable.getSelectedRow(), 0);
            try
            {
                String SQLBorrar = "DELETE FROM " + nombreTabla + " WHERE " + rsmd.getColumnName(1) + " = \"" + id + "\";";
                System.out.println(SQLBorrar);
                c = new ConexionBBDD();
                c.hacerBorrado(SQLBorrar);
                actualizarJtable(jtable, nombreTabla);
            } catch (Exception e)
            {
                JOptionPane.showInternalMessageDialog(table.getRootPane(), "Hace referencia a otra tabla");
                //  Logger.getLogger(Utilidades.class.getName()).log(Level.SEVERE, null, e);
            }
        } catch (Exception e)
        {
            JOptionPane.showInternalMessageDialog(table.getRootPane(), "Tiene que selecionar la fila a modificar");
        }
        c.cerrarConexion();
    }

    /**
     * Método para actualizar el JTable correspondiente
     * @param jtable
     * @param tabla
     * @throws SQLException
     * @throws Exception 
     */
    public static void actualizarJtable(JTable jtable, String tabla) throws SQLException, Exception
    {
        jtable = utils.Utilidades.rellenarJTable("SELECT * FROM " + tabla + ";", jtable);
    }
}
