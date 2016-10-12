/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stevent.controller.evento;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Yuri Pereira <yuri.souza@al.infnet.edu.br>
 */
@WebServlet("/inserirEvento")
public class InserirEventoController extends HttpServlet {

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

//        //ERRO DE RETORNO
//        List<String> erros = new ArrayList<String>();
//        
//        //PÁGINA DE RETORNO
//        String pagina;
//
//        //1º - RECEBER OS DADOS DO FORMULÁRIO
//        String nome = request.getParameter("nome");
//        String descricao = request.getParameter("descricao");
//
//        //2º - VALIDAR ESSES DADOS (SE ESTÃO VAZIOS OU NULOS
//        if (nome == null || nome.length() == 0) {
//            erros.add("O usuário não informou o usuário");
//        }
//        //VALIDAR TODOS OS OUTROS CAMPOS
//
//        //3º - VERIFICAR SE HÁ ERROS E ACESSAR O BD
//        if (erros.isEmpty()) {
//
//            //INSTANCIA UM OBJETO DO TIPO (NESSE CASO EVENTO)
//            Evento evento = new Evento();
//            evento.setNome(nome);
//            evento.setDescricao(descricao);
//
//            //INSTANCIAR UM OBJETO DE ACESSO AO DAO
//            EventoDao eventoDao = new EventoDao();
//            eventoDao.inserir(evento);
//            
//            //PÁGINA QUE ELE IRÁ
//            pagina = "index.jsp";
//        } else {
//            //HÁ ERROS!
//            
//            //PÁGINA QUE ELE IRÁ
//            pagina = "cadastro.jsp";
//            
//            //SET UM ATRIBUTO PARA A PÁGINA QUE VAI SER MANDADO PASSANDO OS ERROS
//            request.setAttribute("erros", erros);
//        }
//        
//        //DESPACHA PARA A PÁGINA COM OS REQUESTS
//        RequestDispatcher rd = request.getRequestDispatcher(pagina); 
//        rd.forward(request, response);

    }

}
