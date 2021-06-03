package atividade.modulo04.exercicio02;

public abstract class Ingresso {
    
    private Double valor;
    
    public Ingresso(Double valor){
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    public String imprimeValor(){
        return "R$ " + this.valor;
    }
}
