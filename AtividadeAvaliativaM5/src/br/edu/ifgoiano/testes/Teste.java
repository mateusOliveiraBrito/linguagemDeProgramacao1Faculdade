package br.edu.ifgoiano.testes;

import br.edu.ifgoiano.dominio.Novo;
import br.edu.ifgoiano.dominio.Velho;

public class Teste {

    public static void main(String[] args) {
        System.out.println("===========IMÓVEL NOVO===========");
        Novo imovelNovo = new Novo("Rua dos bobos, n° 0", 12500d);
        imovelNovo.imprimeValorAdicional();
        System.out.println("Valor total: " + imovelNovo.getPreco());

        System.out.println("\n\n");

        System.out.println("===========IMÓVEL VELHO==========");
        Velho imovelVelho = new Velho("Rua dos alfeneiros, n° 4, Surrey", 10000d);
        imovelVelho.imprimeDesconto();
        System.out.println("Valor total: " + imovelVelho.getPreco());
    }
}
