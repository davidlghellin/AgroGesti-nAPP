package conexion;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Clase para el manejo de la base de datos
 * @author david
 */
public class ConexionBBDD
{
    /**
     * Nombre de usuario de la BBDD
     */
    private final String userName = "root";
    /**
     * Contraseña de usuario de la BBDD
     */
    private final String password = "root";
    /**
     * Ip donde se concectará la BBDD
     */
    private final String serverName = "localhost";
    /**
     * Nombre de la BBDD a la que accederemos para trabajar
     */
    private final String dbName = "BAgroGestion";
    /**
     * Instancia con la que trabajaremos, la cuál tiene todos los datos y establece la conexión
     */
    private Connection conexion = null;
    /**
     * Clase con la que interactuaremos con la BBDD, para accesos simples
     * Como en este caso, pasaremos el String, puede que sea más simple de utilizar en este caso
     */
    private Statement stateman;
    /**
     * Clase precompilada, agiliza y facilita la tarea en algunos casos
     * Puede que en está ocasión no facilite la tarea.
     */
    private PreparedStatement consulta;
     /**
      *  Constructor que crea la Conexión de la base de datos, deja todo preparado para trabajar
      * @throws ClassNotFoundException 
      */
    public ConexionBBDD() throws ClassNotFoundException 
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://"+serverName+"/"+dbName, userName, password);
            System.out.println(conexion.getMetaData());
        } catch (SQLException ex)
        {
            Logger.getLogger(ConexionBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Cierra la conexión con la base de datos
     * @throws Exception 
     */
    public void cerrarConexion() throws Exception
    {
        conexion.close();
    }
    
    /**
     * Realiza la inserción en la base de datos pasada como parámetro
     * @param insert Cadena de texto que paseremos a la BBDD para dar de alta una tupla
     * @return true inserción correcta
     */
    public boolean hacerInsercion(String insert)
    {
        try
        {
            stateman = (Statement) conexion.createStatement();
            stateman.executeUpdate(insert);
            return true;
        } catch (SQLException ex)
        {
            Logger.getLogger(ConexionBBDD.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }         
    }

    /**
     * Realiza la consulta de la base de datos que se le pasa como parámetro
     * @param select Cadena de texto que paseremos a la BBDD para hacer una consulta
     * @return Resulset donde se encuentra las consultas
     */
    public ResultSet hacerConsulta(String select)
    {
        ResultSet rs = null;

        return rs;
    }

    /**
     * Realiza el borrado en la base de datos las tuplas correspondientes
     * @param delete
     * @return 
     */
    public boolean hacerBorrado(String delete)
    {
        try
        {
            stateman = (Statement) conexion.createStatement();
            stateman.executeUpdate(delete);
            return true;
            
        } catch (SQLException ex)
        {
            Logger.getLogger(ConexionBBDD.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
