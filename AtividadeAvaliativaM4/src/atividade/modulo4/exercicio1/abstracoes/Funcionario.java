package atividade.modulo4.exercicio1.abstracoes;

public abstract class Funcionario {

    private String nome;
    private String telefone;
    private Double salario;

    public Funcionario(String nome, String telefone, Double salario) {
        this.nome = nome;
        this.telefone = telefone;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String exibeDados() {
        return "Nome: " + this.nome + "\nTelefone: " + this.telefone + "\nSalario: R$" + this.salario;
    }
}
