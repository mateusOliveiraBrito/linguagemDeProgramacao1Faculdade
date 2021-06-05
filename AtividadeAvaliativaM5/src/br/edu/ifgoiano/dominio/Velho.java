package br.edu.ifgoiano.dominio;

public class Velho extends Imovel {

    public Velho(String endereco, Double preco) {
        super(endereco, preco);
        this.desconto = calculaDesconto();
    }

    private Double desconto;

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double valorAdicional) {
        this.desconto = valorAdicional;
    }

    @Override
    public Double getPreco() {
        return super.getPreco() - this.getDesconto();
    }

    private Double calculaDesconto() {
        return super.getPreco() * 0.1;
    }

    public void imprimeDesconto() {
        System.out.println("Desconto: R$" + this.desconto);
    }
}
