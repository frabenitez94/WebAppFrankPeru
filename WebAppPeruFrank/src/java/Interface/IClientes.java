
package Interface;

import DTO.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Francisco Benitez
 */
public interface IClientes {
    
    public boolean Insertar(Cliente c);
    
    public boolean Eliminar(String rut);
    
    public boolean Modificar(Cliente c);
    
    public Cliente ValidaLogin(String rut);
    
    public ArrayList<Cliente> LeerTodo();
    
    
    
}
