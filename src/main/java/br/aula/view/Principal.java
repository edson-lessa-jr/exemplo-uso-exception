package br.aula.view;

import br.aula.controller.FuncionarioController;
import br.aula.model.Funcionario;

public class Principal {

    public static void main(String[] args) {
        gestaoFuncionario();
    }

    protected static void gestaoFuncionario() {
        Funcionario edson = new Funcionario("Edson", 100, 10);
        FuncionarioController dao = new FuncionarioController();
        dao.inserir(edson);

        System.out.println(dao.listarTodos());

        Funcionario sandra = new Funcionario("Sandra", 200, 20);

        try {
            dao.remover(sandra);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
