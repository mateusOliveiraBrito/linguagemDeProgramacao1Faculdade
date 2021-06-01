package atividade.modulo4.exercicio1.funcionarios;

import atividade.modulo4.exercicio1.abstracoes.Funcionario;

public class Gerente extends Funcionario {

    private String departamento;

    public Gerente(String nome, String telefone, Double salario, String departamento) {
        super(nome, telefone, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    @Override
    public String exibeDados() {
        return "|GERENTE|\n" + super.exibeDados() + "\nDepartamento: " + this.departamento;
    }
}
