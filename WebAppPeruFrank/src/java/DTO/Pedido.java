
package DTO;

import java.util.Date;
import DTO.Fecha;
/**
 *
 * @author Francisco Benitez
 */
public class Pedido {
    
    private int idClienteP;
    private int idMesaP;
    private int idComboP;
    private int precioPedido;
    private Fecha fecha;

    public Pedido(int idClienteP, int idMesaP, int idComboP) {
        setIdClienteP(idClienteP);
        setIdMesaP(idMesaP);
        setIdComboP(idComboP);
    }

    public Pedido() {
    }
    
    

    public int getPrecioPedido() {
        return precioPedido;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setIdClienteP(int idClienteP) {
        this.idClienteP = idClienteP;
    }

    public void setIdMesaP(int idMesaP) {
        this.idMesaP = idMesaP;
    }

    public void setIdComboP(int idComboP) {
        this.idComboP = idComboP;
    }

    public void setPrecioPedido(int precioPedido) {
        this.precioPedido = precioPedido;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    
    
}
