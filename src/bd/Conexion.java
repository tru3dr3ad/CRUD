package bd;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Kristal
 */
public class Conexion {

    private Connection cone;

    public Conexion() {
        try {
            Class.forName("oracle.driver.jdbc.Driver");
            cone = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "CRUD", "123");
        } catch (Exception e) {
            System.out.println("Error de Conexion: " + e.getMessage());
        }
    }

    public Connection getCone() {
        return cone;
    }

    public void Desconectar() {
        cone = null;
    }
}
