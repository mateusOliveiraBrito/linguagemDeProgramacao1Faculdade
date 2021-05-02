package atividade.modulo3.exercicio01;

import java.util.Calendar;

public class Pessoa {

    public Pessoa(String nome, Calendar dataDeNascimento, Double altura) {
        setNome(nome);
        setDataDeNascimento(dataDeNascimento);
        setAltura(altura);
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

    private Integer calculeIdadePessoa() {
        Calendar calendario = Calendar.getInstance();
        int idade = calendario.get(Calendar.YEAR) - _dataDeNascimento.get(Calendar.YEAR);
        return idade;
    }

    public void imprimaDadosPessoa() {
        System.out.println("\n====DADOS===="
                + "\nNome: " + _nome
                + "\nData de Nascimento: " + formateDataDeNascimento()
                + "\nIdade: " + calculeIdadePessoa()
                + "\nAltura: " + _altura);
    }

    private String formateDataDeNascimento() {
        return _dataDeNascimento.get(Calendar.DAY_OF_MONTH)
                + "/" + _dataDeNascimento.get(Calendar.MONTH)
                + "/" + _dataDeNascimento.get(Calendar.YEAR);
    }
}
