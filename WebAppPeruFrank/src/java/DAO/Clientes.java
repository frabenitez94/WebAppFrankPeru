

package DAO;

import DTO.Cliente;
import DTO.Conexion;
import Interface.IClientes;
import java.util.ArrayList;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Francisco Benitez
 */
public class Clientes implements IClientes{
    
    //variable que contendra querys;
    
    PreparedStatement ps;
    
    // Querys de consulta SQL;
    private static final String SQL_INSERT  = "insert into cliente values (?,?,?,?,?,?,?)";
    private static final String SQL_READ = "select *from cliente where usuarioCliente=?";
    
            
            
    //Inicializo conexion.
    private static final Conexion cnn = Conexion.getInstance();
    
    
    
    

    @Override
    public boolean Insertar(Cliente c) {
        int aux = 0;
        
        try {
            ps = cnn.getCnn().prepareStatement(SQL_INSERT);
            ps.setString(1, c.getRut());
            ps.setString(2, c.getNombreUsuario());
            ps.setString(3, c.getNombreCompleto());
            ps.setString(4, c.getPasswd());
            ps.setString(5, c.getDireccion());
            ps.setInt(6, c.getTelefono());
            ps.setInt(7, c.getIdComuna());
            
            aux = ps.executeUpdate();
            
            if (aux>0) {
                return true;
            }
        } catch (Exception ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean Eliminar(String rut) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Modificar(Cliente c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente ValidaLogin(String usu) {
        Cliente c = null;        
        
        try {
            ps = cnn.getCnn().prepareStatement(SQL_READ);
            ResultSet res = ps.executeQuery();
            while (res.next()) {               
                c = new Cliente();
                c.setRut(res.getString("rut"));
                c.setNombreUsuario(res.getString("usuarioCliente"));
                c.setNombreCompleto(res.getString("nombreCliente"));
                c.setPasswd(res.getString("claveCliente"));
                c.setDireccion(res.getString("direccionCliente"));
                c.setIdComuna(res.getInt("idComuna"));
            }
        } catch (Exception ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }

    @Override
    public ArrayList<Cliente> LeerTodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
