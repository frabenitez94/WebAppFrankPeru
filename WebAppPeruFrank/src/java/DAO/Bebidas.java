/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Bebida;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import DTO.Conexion;
import java.sql.PreparedStatement;

/**
 *
 * @author Francisco Benitez
 */
public class Bebidas {
    
    PreparedStatement ps;
    
    private static final String SQL_READALL = "select *from bebidas";
    
    
    private static final Conexion cnn = Conexion.getInstance();
    
    
    
    
    public ArrayList<Bebida> LeerTodo() {
        ArrayList<Bebida> lista = new ArrayList<>();
        
        try {
            ps = cnn.getCnn().prepareStatement(SQL_READALL);
            ResultSet res = ps.executeQuery();
            
            
            while (res.next()) {               
                Bebida b = new Bebida();
                b.setIdBebida(res.getInt("idBebida"));
                b.setNombre(res.getString("nombreBebida"));
                b.setPrecio(res.getInt("precioBebida"));
                lista.add(b);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(Comunas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}
