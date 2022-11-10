package br.aula.controller;

import br.aula.model.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {
    private static List<Funcionario> funcionarioList = new ArrayList<>();


    public void inserir(Funcionario funcionario){
        funcionarioList.add(funcionario);
    }
    public List<Funcionario> listarTodos(){
        return new ArrayList<>(funcionarioList);
    }
    public Funcionario remover(Funcionario funcionario) throws Exception {

        if (funcionarioList.contains(funcionario)){
            funcionarioList.remove(funcionario);
            return funcionario;
        }
        /*System.out.println("Funcionário não existe");
        return null;*/
        throw new Exception("Funcionário não existe");

    }
}
