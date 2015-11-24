/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.text.html.HTML.Tag.SELECT;

/**
 *
 * @author david
 */
public class ConexionBBDD
{

    private Connection conexion = null;
    private PreparedStatement consulta;
    private final String userName = "root";
    private final String password = "root";
    private final String serverName = "localhost";
    // private final int portNumber = 3306;
    private final String dbName = "BAgroGestion";

    //Constructor que crea la Conexión de la base de datos
    public ConexionBBDD() 
    {
        try
        {
            conexion = DriverManager.getConnection("jdbc:mysql://"+serverName+"/"+dbName, userName, password);
            System.out.println("www");
        } catch (SQLException ex)
        {
            Logger.getLogger(ConexionBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Cierra la conexión con la base de datos
    public void cerrarConexion() throws Exception
    {
        conexion.close();
    }

    //Realiza la consulta de la base de datos que se le pasa como parámetro
    public ResultSet hacerConsulta(String select)
    {
        ResultSet rs = null;

        return rs;
    }

    //Realiza la inserción en la base de datos pasada como parámetro
    public boolean hacerInsercion(String insert)
    {
        try
        {
            System.out.println(insert);
            
            java.sql.Statement s = conexion.createStatement();
            s.executeUpdate(insert);
            
            //Statement s=conexion.createStatement();
           // PreparedStatement ps = conexion.prepareStatement(insert);
            /*  ps.setString(1, d.getNombre());
            ps.setInt(2, d.getExistencias());
            ps.setFloat(3, d.getValor());*/

           // ps.executeUpdate();
            
        } catch (SQLException ex)
        {
            Logger.getLogger(ConexionBBDD.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } return true;
    }

    //Realiza el borrado en la base de datos pasada como parámetro
    public boolean hacerBorrado(String delete)
    {

        return false;
    }

}
