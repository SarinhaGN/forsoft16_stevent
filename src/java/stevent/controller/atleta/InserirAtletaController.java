/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stevent.controller.atleta;

import java.io.IOException;
import java.util.ArrayList;
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
@WebServlet("/inserirAtleta")
public class InserirAtletaController extends HttpServlet {

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
        
        List<String> erros = new ArrayList<String>();

        String pagina;

        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");
        String imagem = request.getParameter("imagem");
//        int modalidade = Integer.parseint(request.getParameter("id_modalidade"));
//        int equipe = Integer.parseint(request.getParameter("id_equipe"));

        if (nome == null || nome.length() == 0) {
            erros.add("O usuário não informou o usuário");
        }
        if (email.isEmpty()) {
            erros.add("O usuário não informou o email");
        }
        if (senha.isEmpty()) {
            erros.add("O usuário não informou senha");
        }
        if (imagem.isEmpty()) {
            erros.add("O usuário não informou a imagem");
        }
//        if (modalidade.isEmpty()) {
//            erros.add("O usuário não informou a modalidade");
//        }
//        if (equipe.isEmpty()) {
//            erros.add("O usuário não informou a equipe");
//        }

        if (erros.isEmpty()) {

            Atleta atleta = new Atleta();
            atleta.setNome(nome);
            atleta.setEmail(email);
            atleta.setSenha(senha);
            atleta.setImagem(imagem);
//            atleta.setModalidade(modalidade);
//            atleta.setEquipe(equipe);

            AtletaDAO atletaDao = new AtletaDAO();
            atletaDao.inserir(atleta);

            pagina = "/web/atleta/index.jsp";
        } else {

            pagina = "/web/atleta/cadastro.jsp";

            request.setAttribute("erros", erros);
        }

        RequestDispatcher rd = request.getRequestDispatcher(pagina);
        rd.forward(request, response);

    
    }

    
}
