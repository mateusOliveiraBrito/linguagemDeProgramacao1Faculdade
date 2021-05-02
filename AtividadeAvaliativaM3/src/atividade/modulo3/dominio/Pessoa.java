package atividade.modulo3.dominio;

import java.util.Calendar;

public class Pessoa {

    public Pessoa(String nome, Calendar dataDeNascimento, Double altura) {
        _nome = nome;
        _dataDeNascimento = dataDeNascimento;
        _altura = altura;
    }

    private String _nome;
    private Calendar _dataDeNascimento;
    private Double _altura;

    public String getNome() {
        return _nome;
    }

    public void setNome(String _nome) {
        this._nome = _nome;
    }

    public Calendar getDataDeNascimento() {
        return _dataDeNascimento;
    }

    public void setDataDeNascimento(Calendar _dataDeNascimento) {
        this._dataDeNascimento = _dataDeNascimento;
    }

    public Double getAltura() {
        return _altura;
    }

    public void setAltura(Double _altura) {
        this._altura = _altura;
    }

    public Integer calculeIdadePessoa() {
        Calendar calendario = Calendar.getInstance();
        int idade = calendario.get(Calendar.YEAR) - _dataDeNascimento.get(Calendar.YEAR);
        return idade;
    }

    public void imprimaDadosPessoa() {
        System.out.println("Nome: " + _nome
                + "Data de Nascimento: " + _dataDeNascimento
                + "Idade: "
                + "Altura: " + _altura);
    }
}
