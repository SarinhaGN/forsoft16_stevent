package stevent.controller.equipe;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import stevent.model.equipe.Equipe;
import stevent.model.equipe.EquipeDAO;

@WebServlet("/alterarEquipe")
public class AlterarEquipeController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<String> erros = new ArrayList<String>();

        String pagina;

        int id = Integer.parseInt(request.getParameter("id"));
        String nome = request.getParameter("nome");

        if (nome == null || nome.length() == 0) {
            erros.add("O usuário não informou o Usuário");

        }
        
        int id_modalidade = Integer.parseInt(request.getParameter("id_modalidade"));

        if (erros.isEmpty()) {

            Equipe equipe = new Equipe();
            equipe.setId(id);

            equipe.setNome(nome);
            equipe.getModalidade().setId(id_modalidade);

            EquipeDAO equipeDao = new EquipeDAO();
            equipeDao.alterar(equipe);

            pagina = "index.jsp";
        } else {

            pagina = "cadastro.jsp";

            request.setAttribute("erros", erros);
        }

        RequestDispatcher rd = request.getRequestDispatcher(pagina);
        rd.forward(request, response);
    }

}
