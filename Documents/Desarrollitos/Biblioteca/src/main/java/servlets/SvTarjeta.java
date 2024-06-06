
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.controladora;

@WebServlet(name = "SvTarjeta", urlPatterns = {"/SvTarjeta"})
public class SvTarjeta extends HttpServlet {
    
    controladora control = new controladora();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String NumTarjeta =request.getParameter("numCard");
        String NombreTarjeta = request.getParameter("nameCard");
        String FechaVencimiento = request.getParameter("date");
        String CVV = request.getParameter("cvv");
        
        control.crearTarjeta(NumTarjeta, NombreTarjeta, FechaVencimiento, CVV);

        
        response.sendRedirect("menuCliente.jsp");
    }
    

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
