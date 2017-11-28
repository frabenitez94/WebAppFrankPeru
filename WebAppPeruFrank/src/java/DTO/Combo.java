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
public class Combo {
    private Plato plato;
    private Bebida bebida;

    public Combo(Plato plato, Bebida bebida) {
        this.plato = plato;
        this.bebida = bebida;
    }

    public Plato getPlato() {
        return plato;
    }

    public Bebida getBebida() {
        return bebida;
    }
    
    
}
