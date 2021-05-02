package atividade.modulo3.testes;

import atividade.modulo3.exercicio01.Pessoa;
import atividade.modulo3.exercicio02.Elevador;
import java.util.Calendar;

public class Teste {

    public static void main(String[] args) {

        //TESTES EXERCÍCIO 01:
        /*Calendar dataDeNascimento = Calendar.getInstance();
        dataDeNascimento.set(2001, 06, 23);
        
        Pessoa pessoa = new Pessoa("Mateus Oliveira Brito", dataDeNascimento, 1.85);
        pessoa.imprimaDadosPessoa();
        pessoa.setNome("Baltazar");
        pessoa.imprimaDadosPessoa();*/
        
        //TESTES EXERCÍCIO 02:
        Elevador elevador = new Elevador();

        elevador.Inicialize(4, 6);

        elevador.Entra();
        elevador.Entra();
        elevador.Entra();
        elevador.Entra();

        elevador.Sobe();
        elevador.Sobe();
        elevador.Sobe();
        elevador.Sobe();

        elevador.Desce();

        elevador.Sai();
        elevador.Sai();

        elevador.imprimaEstadoAtual();
    }
}
