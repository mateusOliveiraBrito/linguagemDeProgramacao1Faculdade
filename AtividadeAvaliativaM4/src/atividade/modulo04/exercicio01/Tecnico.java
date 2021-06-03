package atividade.modulo04.exercicio01;

import atividade.modulo04.exercicio01.Assistente;

public class Tecnico extends Assistente {
    
    public Tecnico(String nome, String telefone, Double salario, Integer numeroDeMatricula) {
        super(nome, telefone, salario, numeroDeMatricula);
        aplicaBonusSalarial();
    }
    
    public void aplicaBonusSalarial(){
        this.setSalario(this.getSalario() + (this.getSalario() * 0.1));
    }
    
    public String exibeDados(){
        return "|ASSISTENTE TÉCNICO|\n" + super.exibeDados();
    }
}
