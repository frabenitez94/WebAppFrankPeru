
package DAO;

import DTO.Comuna;
import DTO.Conexion;
import Interface.IComunas;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;

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
                c.setId_comuna(res.getInt("idComuna"));
                c.setComuna_nombre(res.getString("comunaNombre"));
                c.setId_provincia(res.getInt("idProvincia"));
                lista.add(c);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(Comunas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}
