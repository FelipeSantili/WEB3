import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "lifeCycleServlet", value = "/lifeCycleServlet")
public class LifeCycleServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Chamou o método init");
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Chamou o método service");
        response.setContentType("text/html");
        response.getWriter().println("<h1>Servlet LifeCycleServlet</h1>");
    }

    @Override
    public void destroy() {
        System.out.println("Chamou o método destroy");
    }
}