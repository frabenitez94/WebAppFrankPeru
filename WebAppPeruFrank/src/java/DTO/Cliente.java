
package DTO;

/**
 *
 * @author Francisco Benitez
 */
public final class Cliente {
    
    private String rut;
    private String nombreUsuario;
    private String nombreCompleto;
    private String passwd;
    private int idComuna;
    private String direccion;
    private int telefono;

    public Cliente(String rut, String nombreUsuario, String nombreCompleto, String passwd, int idComuna, String direccion, int telefono) {
        setRut(rut);
        setNombreUsuario(nombreUsuario);
        setNombreCompleto(nombreCompleto);
        setPasswd(passwd);
        setIdComuna(idComuna);
        setDireccion(direccion);
        setTelefono(telefono);
    }

    public Cliente(){
    }
    
    
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        
        this.rut = rut;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public int getIdComuna() {
        return idComuna;
    }

    public void setIdComuna(int idComuna) {
        this.idComuna = idComuna;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    public boolean validaRut(String rut,String digito){
        
        String error = "";
        int multiplica = 2, suma = 0, numDigito = 0;

        String rutaux = rut;
        String digitoaux = digito;
        boolean digitoCorrecto = false;

        if (digito.isEmpty()) {
            error += " - Debe ingresar digito verificador <br>";
        }

        if (rut.length() <= 6) {
            error += "- Largo de Rut incorrecto.<br>";
        }

        if (rut.isEmpty()) {
            error += "- Debe ingresar el rut <br>";
        } else {
            
            for (int i = (rut.length()-1); i >= 0; i--) {
                suma = suma + Integer.parseInt(rut.substring(i, i + 1)) * multiplica;
                multiplica++;
                if (multiplica == 8) {
                    multiplica = 2;
                }
            }
        //     numDigito = Integer.parseInt(digito);
            numDigito = 11 - (suma % 11);
            if (numDigito == 10 && digito.equals("K")) {
                digitoCorrecto = true;
            } else if (numDigito == 11 && Integer.parseInt(digito) == 0) {
                digitoCorrecto = true;
            } else if (numDigito == Integer.parseInt(digito)) {
                digitoCorrecto = true;
            }
            if (digitoCorrecto == false) {
                error += "- Rut no valido. <br>";
            }
        }
            if (error.isEmpty()) {
                    return true;
            } else {
                return false;
            }
    }

    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + ", nombreUsuario=" + nombreUsuario + ", nombreCompleto=" + nombreCompleto + ", passwd=" + passwd + ", idComuna=" + idComuna + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
    
}
