

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(name = "ContadorDeAcessos", value = "/contador-de-acessos")
public class ContadorDeAcessosServlet extends HttpServlet {

    private int contador = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        contador++;
        response.setContentType("text/html");
        response.getWriter().println("<h1>Contador de Acessos</h1>");
        response.getWriter().println("<p>Número de acessos: " + contador + "</p>");
    }
}