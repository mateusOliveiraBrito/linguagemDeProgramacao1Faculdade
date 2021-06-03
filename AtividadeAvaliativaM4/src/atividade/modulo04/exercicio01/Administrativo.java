package atividade.modulo04.exercicio01;

import atividade.modulo04.exercicio01.Assistente;

public class Administrativo extends Assistente {
    
    private String turno;
    
    public Administrativo(String nome, String telefone, Double salario, 
            Integer numeroDeMatricula, String turno) {
        super(nome, telefone, salario, numeroDeMatricula);
        this.turno = turno;
        aplicaAdicionalNoturno();
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    private void aplicaAdicionalNoturno(){
        if (turno.equalsIgnoreCase("Noturno")){
            this.setSalario(this.getSalario() + (this.getSalario() * 0.2));
        }
    }
    
    @Override
    public String exibeDados(){
        return "|ASSISTENTE ADMINISTRATIVO|\n" + super.exibeDados() + "\nTurno: " + this.turno;
    }
}
