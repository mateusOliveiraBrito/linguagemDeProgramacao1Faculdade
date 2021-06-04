package atividade.modulo04.exercicio02;

public class Normal extends Ingresso {
    
    public Normal(Double valor){
        super(valor);
    }
    
    public String imprimeTipoIngresso(){
        return "Ingresso Normal";
    }
}
