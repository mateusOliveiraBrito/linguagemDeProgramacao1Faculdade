package atividade.modulo04.testes;

import atividade.modulo04.exercicio01.Administrativo;
import atividade.modulo04.exercicio01.Gerente;
import atividade.modulo04.exercicio01.Tecnico;
import atividade.modulo04.exercicio02.CamaroteInferior;
import atividade.modulo04.exercicio02.CamaroteSuperior;
import atividade.modulo04.exercicio02.Normal;

public class Teste {

    public static void main(String[] args) {
        TestesQuestao01();
        TestesQuestao02();
    }

    private static void TestesQuestao01() {
        System.out.println("=====TESTES DA QUESTÃO 01=====");
        Gerente gerente = new Gerente("Mateus Oliveira Brito", "4002-8922", 4200d, "Desenvolvimento");
        System.out.println(gerente.exibeDados());

        System.out.println("==================================================");

        Tecnico assistenteTecnico = new Tecnico("Altair Garcia", "3505-8787", 1500d, 20210501);
        System.out.println(assistenteTecnico.exibeDados());

        System.out.println("==================================================");

        Administrativo assistenteAdministrativo = new Administrativo("Junior Silva", "46658998", 1200d, 20210502, "Diurno");
        System.out.println(assistenteAdministrativo.exibeDados());

        System.out.println("==================================================");

        Administrativo assistenteAdministrativoNoturno = new Administrativo("Rosiane", "35062356", 1400d, 20210503, "Noturno");
        System.out.println(assistenteAdministrativoNoturno.exibeDados());

        System.out.println("\n\n\n");
    }

    private static void TestesQuestao02() {
        System.out.println("=====TESTES DA QUESTÃO 02=====");

        Normal ingressoNormal = new Normal(30d);
        System.out.println(ingressoNormal.imprimeTipoIngresso());
        System.out.println(ingressoNormal.imprimeValor());

        System.out.println("==================================================");

        CamaroteInferior camaroteInferior = new CamaroteInferior(50d, "Ao lado do balcão de frios");
        System.out.println(camaroteInferior.imprimeLocalizacao());
        System.out.println(camaroteInferior.imprimeValor());

        System.out.println("==================================================");

        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(75d);
        System.out.println(camaroteSuperior.imprimeValor());
    }
}
