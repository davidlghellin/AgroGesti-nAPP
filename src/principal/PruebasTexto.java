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
       // c.hacerInsercion("INSERT INTO TParcela (IdParcela,IdFinca,Descripcion) VALUES (\"dddd\",\"La Romana\",\"----------\");");
       // c.hacerBorrado("DELETE FROM TParcela WHERE IdParcela = 'uuuu';");
        c.hacerInsercion("UPDATE TParcela SET Descripcion='aa' WHERE IdParcela = 'dddd';");
        c.cerrarConexion();
    }
}
