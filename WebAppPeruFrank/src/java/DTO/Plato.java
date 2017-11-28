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
public class Plato {
    private int idPlato;
    private String nombre;
    private int precio;

    public Plato(int idPlato, String nombre, int precio) {
        setIdPlato(idPlato);
        setIdPlato(idPlato);
        setPrecio(precio);
    }
    
    public Plato(){
    }

    public int getIdPlato() {
        return idPlato;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setIdPlato(int idPlato) {
        this.idPlato = idPlato;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
