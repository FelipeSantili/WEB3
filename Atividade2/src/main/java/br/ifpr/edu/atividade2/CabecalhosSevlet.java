package br.ifpr.edu.atividade2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cabecalhos")
public class CabecalhosSevlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();
        String host = req.getHeader("user-agent");
        String cliente = req.getHeader("host");
        String codificacao = req.getHeader("accept-enconding");
        String idioma = req.getHeader("accept-language");


        writer.println("<html>");

        writer.println("<p>" + host + "</p>");
        writer.println("<p>" + cliente + "</p>");
        writer.println("<p>" + codificacao + "</p>");
        writer.println("<p>" + idioma + "</p>");


        writer.println("</html>");

    }
}
