
package DTO;

import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;


/**
 *
 * @author Francisco Benitez
 */
public class Conexion {
    public static Conexion instancia;
    private Connection cnn;
        
    public Conexion(){
        String driver = "com.mysql.jdbc.Driver";
        String url ="jdbc:mysql://localhost:3306/perufrank";
        String usu ="root";
        String pass ="";
        
        try {
            Class.forName(driver);
            cnn = DriverManager.getConnection(url, usu, pass);
        } catch (Exception ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }
    public static Conexion getInstance(){
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }
    
    public void cerrar(){
        instancia = null;
    }
        
    
    public Connection getCnn(){
        return cnn;
    }
}
