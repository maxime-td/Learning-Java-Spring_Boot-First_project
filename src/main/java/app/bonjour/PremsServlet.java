package app.bonjour;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serial;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/prems/*", loadOnStartup = 1)
public class PremsServlet extends HttpServlet   {



    @Serial
    private static final long serialVersionUID = 1L;
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        doGet(request,response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Récupérer le paramètre du formulaire
        String texte = request.getParameter("texte");

        PrintWriter out = response.getWriter();
        out.println(texte);

    }
}