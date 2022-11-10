package br.aula.view;

import br.aula.controller.FuncionarioController;
import br.aula.model.Funcionario;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletTeste", value = {"/ServletTeste", "/index.jsp"})
public class ServletTeste extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("Hello Word Saída");
        //Principal.gestaoFuncionario();
        Funcionario edson = new Funcionario("Edson", 100, 10);
        FuncionarioController dao = new FuncionarioController();
        dao.inserir(edson);

        out.println(dao.listarTodos());

        Funcionario sandra = new Funcionario("Sandra", 200, 20);
        try {
            dao.remover(sandra);
        } catch (Exception e) {
            out.println(e.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
