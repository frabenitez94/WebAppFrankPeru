
package DTO;

import java.util.Date;
import DTO.Fecha;
/**
 *
 * @author Francisco Benitez
 */
public class Pedido {
    
    private Cliente cliente;
    private Mesa mesa;
    private Combo combo;
    private int precioPedido;
    private Fecha fecha;

    public Pedido(Cliente cliente, Mesa mesa, Combo combo) {
        setCliente(cliente);
        setMesa(mesa);
        setCombo(combo);
    }

    public Pedido() {
    }
    
    

    public int getPrecioPedido() {
        return precioPedido;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public void setCombo(Combo combo) {
        this.combo = combo;
    }

    public void setPrecioPedido(int precioPedido) {
        this.precioPedido = precioPedido;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    
    
    public void calcularPrecio(){
        int precioBebida;
        int precioPlato;
        
        precioBebida = combo.getBebida().getPrecio();
        precioPlato = combo.getPlato().getPrecio();
        
        precioPedido = precioBebida + precioPlato;
    }
    
    
    
}
