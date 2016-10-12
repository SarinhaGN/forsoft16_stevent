/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stevent.controller.atleta;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import stevent.model.atleta.Atleta;
import stevent.model.atleta.AtletaDAO;

/**
 *
 * @author Yuri Pereira
 */
@WebServlet("/listarAtleta")
public class ListarAtletaController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        AtletaDAO atletaDao = new AtletaDAO();
        List<Atleta> atletas = atletaDao.listar();
        
        request.setAttribute("listarAtletas", atletas);
        
        String pagina = "/web/atleta/index.jsp";
        
        RequestDispatcher rd = request.getRequestDispatcher(pagina); 
        rd.forward(request, response);
    }

}
