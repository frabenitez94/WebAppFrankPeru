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
    private String nombrePlato;
    private int precio;

    public Plato(int idPlato, String nombrePlato, int precio) {
        setIdPlato(idPlato);
        setNombrePlato(nombrePlato);
        setPrecio(precio);
    }
    
    public Plato(){
    }

    public int getIdPlato() {
        return idPlato;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public int getPrecio() {
        return precio;
    }

    public void setIdPlato(int idPlato) {
        this.idPlato = idPlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
