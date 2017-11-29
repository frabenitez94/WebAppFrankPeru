/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Plato;
import DTO.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Francisco Benitez
 */
public class Platos {
    PreparedStatement ps;
    
    private static final String SQL_READALL = "select *from bebidas";
    
    
    private static final Conexion cnn = Conexion.getInstance();
    
    
    
    
    public ArrayList<Plato> LeerTodo() {
        
        ArrayList<Plato> lista = new ArrayList<>();
        
        try {
            ps = cnn.getCnn().prepareStatement(SQL_READALL);
            ResultSet res = ps.executeQuery();
            
            
            while (res.next()) {               
                Plato p = new Plato();
                p.setIdPlato(res.getInt("idBebida"));
                p.setNombrePlato(res.getString("nombreBebida"));
                p.setPrecio(res.getInt("precioBebida"));
                lista.add(p);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(Comunas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}
