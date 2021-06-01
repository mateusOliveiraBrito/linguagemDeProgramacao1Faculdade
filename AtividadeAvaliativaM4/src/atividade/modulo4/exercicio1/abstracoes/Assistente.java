package atividade.modulo4.exercicio1.abstracoes;

public abstract class Assistente extends Funcionario {

    private Integer numeroDeMatricula;

    public Assistente(String nome, String telefone, Double salario, Integer numeroDeMatricula) {
        super(nome, telefone, salario);
        this.numeroDeMatricula = numeroDeMatricula;
    }

    public Integer getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    public void setNumeroDeMatricula(Integer numeroDeMatricula) {
        this.numeroDeMatricula = numeroDeMatricula;
    }

    @Override
    public String exibeDados() {
        return super.exibeDados() + "\nNúmero de Matrícula: " + this.numeroDeMatricula;
    }
}
