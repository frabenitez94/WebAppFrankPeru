/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.Clientes;
import DTO.Cliente;
import DTO.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Francisco Benitez
 */
@WebServlet(name = "SRegistro", urlPatterns = {"/SRegistro"})
public class SRegistro extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
         //Inicializo objetos.
        String mensaje;
        Conexion con = Conexion.getInstance();
        HttpSession SesRegistro = request.getSession(true);
        Clientes cli = new Clientes();
        Cliente c = new Cliente();
        try {
            
            //Traer info jsp.
            /*
            String xUsuario = request.getParameter("nombreUsuario");
            String xPassword1 = request.getParameter("1pss");
            String xPassword2 = request.getParameter("2pss");
            String xRut = request.getParameter("rut");
            String xDigito = request.getParameter("digito");
            String xComuna = request.getParameter("comuna");
            String xTelefono = request.getParameter("telefono");
            String xDireccion = request.getParameter("direccion");
            String xNombreCompleto = request.getParameter("nombreCOmpleto");
            */
            //Seteo datos Cliente
            /*
            c.setNombreCompleto(xNombreCompleto);
            c.setNombreUsuario(xUsuario);
            c.setTelefono(Integer.parseInt(xTelefono));
            c.setDireccion(xDireccion);
            c.setIdComuna(Integer.parseInt(xComuna));
            if (xPassword1 == xPassword2) {
                c.setPasswd(xPassword1);
            }else{
                mensaje = "Password no corresponden";
            }
            if (c.validaRut(xRut, xDigito)){
                c.setRut(xRut+"-"+xDigito);
            }else{
                mensaje = "Rut invalido";
            }
            */
            c.setDireccion("rolando Fronden");
            c.setIdComuna(1);
            c.setRut("18669347-7");
            c.setPasswd("12345asd");
            c.setTelefono(88867447);
            c.setNombreUsuario("frabenite");
            c.setNombreCompleto("francisco Benitez");
            cli.Insertar(c);
            mensaje="Exito";
            SesRegistro.setAttribute("mensaje", mensaje); 
           response.sendRedirect("exito.jsp");
        } catch (Exception ex) {
            mensaje ="Error"+ex.getMessage();
            SesRegistro.setAttribute("mensaje", mensaje);
            response.sendRedirect("exito.jsp");
        }
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
