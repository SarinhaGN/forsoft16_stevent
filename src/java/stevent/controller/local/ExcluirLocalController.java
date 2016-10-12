/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stevent.controller.local;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import stevent.model.local.LocalDAO;

/**
 *
 * @author Yuri Pereira <yuri.souza@al.infnet.edu.br>
 */
@WebServlet("/ExcluirLocalController")
public class ExcluirLocalController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    		int id = Integer.parseInt(request.getParameter("Id"));
    		
    		LocalDAO localDao = new LocalDAO();
    		localDao.excluir(id);
    		
            String pagina = "/web/local/index.jsp";
        
    		RequestDispatcher rd = request.getRequestDispatcher(pagina); 
    		rd.forward(request, response);

    }

}
