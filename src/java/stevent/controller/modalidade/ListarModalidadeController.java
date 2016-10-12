package stevent.controller.modalidade;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import stevent.model.modalidade.Modalidade;
import stevent.model.modalidade.ModalidadeDAO;

@WebServlet("/listarModalidade")
public class ListarModalidadeController extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<String> erros = new ArrayList<String>();

        String pagina;

        String nome = request.getParameter("nome");
        if (nome == null || nome.length() == 0) {
            erros.add("O usuário não informou o usuário");
        }

        if (erros.isEmpty()) {

            ModalidadeDAO modalidadeDao = new ModalidadeDAO();
            List<Modalidade> modalidades = modalidadeDao.listar();

            pagina = "index.jsp";
        } else {

            pagina = "cadastro.jsp";

            request.setAttribute("erros", erros);
        }

        RequestDispatcher rd = request.getRequestDispatcher(pagina);
        rd.forward(request, response);
    }

}
