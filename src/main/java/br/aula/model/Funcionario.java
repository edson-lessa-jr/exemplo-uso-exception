package br.aula.model;

import java.util.Objects;

public class Funcionario {
    private String nome;
    private double salario;
    private double percentualComissao;

    public Funcionario() {
    }

    public Funcionario(String nome, double salario, double percentualComissao) {
        this.nome = nome;
        this.salario = salario;
        this.percentualComissao = percentualComissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public double getSalarioLiquido(){
        return this.salario*(1+(this.percentualComissao/100));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", percentualComissao=" + percentualComissao +
                ", salário líquido=" + this.getSalarioLiquido()+
                '}';
    }
}
