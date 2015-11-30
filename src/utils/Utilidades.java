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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class Utilidades
{
    public static JTable rellenarJTable(String consulta,JTable table) throws ClassNotFoundException, SQLException
    {
        JTable jtbFinca=table;
        ConexionBBDD c = new ConexionBBDD();
        ResultSet rs = c.hacerConsulta(consulta);
        DefaultTableModel    modelo = (DefaultTableModel) jtbFinca.getModel();
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
        return jtbFinca;
    }
    
}
