package br.edu.ifgoiano.dominio;

public abstract class Imovel {

    public Imovel(String endereco, Double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }
    
    private String endereco;
    private Double preco;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
