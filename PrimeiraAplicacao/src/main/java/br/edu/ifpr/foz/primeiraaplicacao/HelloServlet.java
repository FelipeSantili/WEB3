package br.edu.ifpr.foz.primeiraaplicacao;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {

        //O objeto request contem todos os dados da requisição

        String host = request.getHeader("Host");
        System.out.println("O host que fez a requisição é: " + host);

        String method = request.getMethod();
        System.out.println("O método usado foi: " + method);

        PrintWriter writer = response.getWriter();

        writer.println("Essa é a resposta enviada pelo objeto response!");

    }

    public void destroy() {
    }
}