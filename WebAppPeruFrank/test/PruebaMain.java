
import DTO.Bebida;
import DTO.Cliente;
import DTO.Combo;
import DTO.Mesa;
import DTO.Pedido;
import DTO.Plato;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francisco Benitez
 */
public class PruebaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("18669347-7", "frabenitez", "Francisco Benitez Silva", "123456asd", 106, "Vicuña mackena 7000", 988867447);
        Mesa mesa = new Mesa(1, "delivery");
        Plato plato = new Plato(1, "ceviche", 3500);
        Bebida bebida = new Bebida(1, "Pepsi Cola", 1500);
        Combo combo = new Combo(plato, bebida);
        Pedido pedido = new Pedido(cliente, mesa, combo);
        pedido.calcularPrecio();
        
        System.out.println(pedido.getPrecioPedido());
        
    }
    
}
