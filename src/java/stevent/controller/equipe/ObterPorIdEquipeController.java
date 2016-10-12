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

@WebServlet("/obterEquipePorId")
public class ObterPorIdEquipeController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<String> erros = new ArrayList<String>();

        String pagina;

        int id = Integer.parseInt(request.getParameter("id"));
        if (id == 0) {
            erros.add(" o usuario nao informou o id");
        }

        if (erros.isEmpty()) {

            EquipeDAO equipeDao = new EquipeDAO();
            Equipe equipe = equipeDao.obterPorId(id);

            pagina = "index.jsp";
        } else {

            pagina = "cadastro.jsp";

            request.setAttribute("erros", erros);
        }

        RequestDispatcher rd = request.getRequestDispatcher(pagina);
        rd.forward(request, response);
    }

}
