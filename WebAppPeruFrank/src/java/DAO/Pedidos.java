/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Conexion;
import DTO.Pedido;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Francisco Benitez
 */
public class Pedidos {
    PreparedStatement ps;
    
    private static final String SQL_READALL = "select *from bebidas";
    
    
    private static final Conexion cnn = Conexion.getInstance();
    
    
    
    
    public ArrayList<Pedido> LeerTodo() {
        ArrayList<Pedido> lista = new ArrayList<>();
        
        try {
            ps = cnn.getCnn().prepareStatement(SQL_READALL);
            ResultSet res = ps.executeQuery();
            
            
            while (res.next()) {               
                Pedido p = new Pedido();
                p.setCliente(res.getInt("idBebida"));
                p.setCombo(res.getString("nombreBebida"));
                p.setFecha(res.getInt("precioBebida"));
                p.setMesa(mesa);
                p.setPrecioPedido(0);
                lista.add(p);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(Comunas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}
