
package DAO;

import DTO.Comuna;
import DTO.Conexion;
import Interface.IComunas;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.sql.DriverManager;

/**
 *
 * @author Francisco Benitez
 */
public class Comunas implements IComunas{

    PreparedStatement ps;
    
    private static final String SQL_READALL = "select *from comunas";
    
    
    private static final Conexion cnn = Conexion.getInstance();
    
    
    @Override
    public ArrayList<Comuna> LeerTodo() {
        ArrayList<Comuna> lista = new ArrayList<>();
        
        try {
            ps = cnn.getCnn().prepareStatement(SQL_READALL);
            ResultSet res = ps.executeQuery();
            
            
            while (res.next()) {               
                Comuna c = new Comuna();
                c.setIdComuna(res.getInt("idComuna"));
                c.setComunaNombre(res.getString("comunaNombre"));
                c.setIdProvincia(res.getInt("idProvincia"));
                lista.add(c);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(Comunas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}
