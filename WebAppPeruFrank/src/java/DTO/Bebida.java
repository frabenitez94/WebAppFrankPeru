/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Francisco Benitez
 */
public class Bebida {
    private int idBebida;
    private String nombre;
    private int precio;

    public Bebida(int idBebida, String nombre, int precio) {
        setIdBebida(idBebida);
        setNombre(nombre);
        setPrecio(precio);
    }
    
    public Bebida(){
    }
   

    public int getIdBebida() {
        return idBebida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setIdBebida(int idBebida) {
        this.idBebida = idBebida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
