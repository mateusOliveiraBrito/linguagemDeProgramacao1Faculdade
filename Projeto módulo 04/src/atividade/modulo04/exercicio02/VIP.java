package atividade.modulo04.exercicio02;

public abstract class VIP extends Ingresso {
    
    private static final Double valorAdicional = 15d;
    
    public VIP(Double valor) {
        super(valor);
        aplicaAdicional(valorAdicional);
    }
    
    protected void aplicaAdicional(Double adicional) {
        this.setValor(this.getValor() + adicional);
    }
    
    @Override
    public String imprimeValor() {
        return "R$ " + this.getValor();
    }
}
