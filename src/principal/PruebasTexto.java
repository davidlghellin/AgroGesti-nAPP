/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import conexion.ConexionBBDD;
import java.sql.SQLException;

/**
 *
 * @author david
 */
public class PruebasTexto
{
    public static void main(String[] args) throws SQLException, Exception
    {
        ConexionBBDD c= new ConexionBBDD();
        c.hacerInsercion("INSERT INTO TParcela (IdParcela,IdFinca,Descripcion) VALUES (\"uuuu\",\"La Romana\",\"----------\");");
        c.cerrarConexion();
    }
}
