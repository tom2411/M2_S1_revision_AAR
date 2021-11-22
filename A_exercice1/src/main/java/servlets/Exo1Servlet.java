package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/")
public class Exo1Servlet extends HttpServlet {

    private static String login_ref = "tom";
    private static String mdp_ref = "tom";


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//TODO récupérer le login et le mdp et les comparer avec la paire stockée statiquement; appeler la jsp bonjour en cas de succès et la jsp de login sinon
        String login = request.getParameter("login");
        String mdp = request.getParameter("mdp");
        boolean ok = false;
        if (login.length() > 0 && mdp.length() > 0) {
            if (login.equals(this.login_ref) && mdp.equals(this.mdp_ref)) {
                ok = true;
                request.setAttribute("login", login);
            }
        }
        if (ok) {
            request.getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
        } else {
            String erreur = "Ce compte n'existe pas !\n Veuillez vérifier vos informations de connexion.";
            request.setAttribute("erreur", erreur);
            request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
    }
}
