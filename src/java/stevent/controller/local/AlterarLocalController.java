/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stevent.controller.local;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import stevent.model.local.Local;
import stevent.model.local.LocalDAO;

/**
 *
 * @author Yuri Pereira <yuri.souza@al.infnet.edu.br>
 */
@WebServlet("/alterarLocal")
public class AlterarLocalController extends HttpServlet {

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

        //ERRO DE RETORNO
        List<String> erros = new ArrayList<String>();
        
        //PÁGINA DE RETORNO
        String pagina;

        //1º - RECEBER OS DADOS DO FORMULÁRIO
        String nome = request.getParameter("Nome");
        String pais = request.getParameter("Pais");
        String estado = request.getParameter("Estado");
        String cidade = request.getParameter("Cidade");
        String bairro = request.getParameter("Bairro");
        String cep = request.getParameter("CEP");
        String endereco = request.getParameter("Endereco");
        String numero = request.getParameter("Numero");
        String complemento = request.getParameter("Complemento");
        int id = Integer.parseInt(request.getParameter("Id"));

        //2º - VALIDAR ESSES DADOS (SE ESTÃO VAZIOS OU NULOS
        
        if (nome == null || nome.length() == 0) {
            erros.add("O usuário não informou o usuário");
        }
        if (pais == null || pais.length() == 0) {
            erros.add("O usuário não informou o usuário");
        }
        if (estado == null || estado.length() == 0) {
            erros.add("O usuário não informou o usuário");
        }
        if (cidade == null || cidade.length() == 0) {
            erros.add("O usuário não informou o usuário");
        }
        if (bairro == null || bairro.length() == 0) {
            erros.add("O usuário não informou o usuário");
        }
        if (cep == null || cep.length() == 0) {
            erros.add("O usuário não informou o usuário");
        }
        if (endereco == null || endereco.length() == 0) {
            erros.add("O usuário não informou o usuário");
        }
        if (numero == null || numero.length() == 0) {
            erros.add("O usuário não informou o usuário");
        }
        
        
        if (erros.isEmpty()) {

            
            Local local = new Local();
            local.setId(id);
            local.setNome(nome);
            local.setEstado(estado);
            local.setCidade(cidade);
            local.setBairro(bairro);
            local.setCep(cep);
            local.setEndereco(endereco);
            local.setNumero(numero);
            local.setComplemento(complemento);
            

            
            LocalDAO localDao = new LocalDAO();
            localDao.alterar(local);
            
            
            pagina = "/web/local/index.jsp";
        } else {
            //HÁ ERROS!
            
            //PÁGINA QUE ELE IRÁ
            pagina = "/web/local/cadastro.jsp";
            
            //SET UM ATRIBUTO PARA A PÁGINA QUE VAI SER MANDADO PASSANDO OS ERROS
            request.setAttribute("erros", erros);
        }
        
        
        RequestDispatcher rd = request.getRequestDispatcher(pagina); 
        rd.forward(request, response);

    }

}