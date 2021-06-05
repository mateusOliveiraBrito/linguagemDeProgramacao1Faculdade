package br.edu.ifgoiano.dominio;

public class Novo extends Imovel {

    public Novo(String endereco, Double preco) {
        super(endereco, preco);
        this.valorAdicional = calculaAdicional();
    }

    private Double valorAdicional;

    public Double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(Double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public Double getPreco() {
        return super.getPreco() + this.getValorAdicional();
    }

    private Double calculaAdicional() {
        return super.getPreco() * 0.3;
    }

    public void imprimeValorAdicional() {
        System.out.println("Valor Adicional: R$" + this.valorAdicional);
    }
}
