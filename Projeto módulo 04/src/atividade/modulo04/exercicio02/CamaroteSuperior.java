package atividade.modulo04.exercicio02;

public class CamaroteSuperior extends VIP {

    private static final Double valorAdicional = 25d;

    public CamaroteSuperior(Double valor) {
        super(valor);
        aplicaAdicional(valorAdicional);
    }

    @Override
    protected void aplicaAdicional(Double adicional) {
        this.setValor(this.getValor() + adicional);
    }

    @Override
    public String imprimeValor(){
        return "VIP Superior: " + super.imprimeValor();
    }
}
