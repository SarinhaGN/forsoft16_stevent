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
@WebServlet("/alterarAtleta")
public class AlterarAtletaController extends HttpServlet {

    
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
        
        //ERRO DE RETORNO
        List<String> erros = new ArrayList<String>();
        
        //PÁGINA DE RETORNO
        String pagina;

        //1º - RECEBER OS DADOS DO FORMULÁRIO
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");
        String imagem = request.getParameter("imagem");
        String modalidade = request.getParameter("modalidade");
        String equipe = request.getParameter("equipe");
     

        //2º - VALIDAR ESSES DADOS (SE ESTÃO VAZIOS OU NULOS
        if (nome==null || nome.length() == 0) {
            erros.add("O usuário não informou o usuário");
        }
        if (email==null || email.length() == 0) {
            erros.add("O usuário não informou o email");
        }
        if (senha==null || senha.length() == 0) {
            erros.add("O usuário não informou senha");
        }
        if (imagem==null || imagem.length() == 0) {
            erros.add("O usuário não informou a imagem");
        }
        if (modalidade==null || modalidade.length() == 0) {
            erros.add("O usuário não informou a modalidade");
        }
        if (equipe==null || equipe.length() == 0) {
            erros.add("O usuário não informou a equipe");
        }
       
        //3º - VERIFICAR SE HÁ ERROS E ACESSAR O BD
        if (erros.isEmpty()) {

            //INSTANCIAR UM OBJETO DO TIPO ATLETA
            Atleta atleta = new Atleta();
            atleta.setNome(nome);
            atleta.setEmail(email);
            atleta.setSenha(senha);
            atleta.setImagem(imagem);
//            atleta.setModalidade(modalidade);;
//            atleta.setEquipe(equipe);
            


            //INSTANCIAR UM OBJETO DE ACESSO AO DAO
            AtletaDAO atletaDao = new AtletaDAO();
            atletaDao.alterar(atleta);
            

            //PÁGINA QUE ELE IRÁ
            pagina = "/web/atleta/index.jsp";
        } else {
            //HÁ ERROS!
            
            //PÁGINA QUE ELE IRÁ
            pagina = "/web/atleta/cadastro.jsp";
            
            //SET UM ATRIBUTO PARA A PÁGINA QUE VAI SER MANDADO PASSANDO OS ERROS
            request.setAttribute("erros", erros);
        }
        
        //DESPACHA PARA A PÁGINA COM OS REQUESTS
        RequestDispatcher rd = request.getRequestDispatcher(pagina); 
        rd.forward(request, response);
    
    }
    
}
