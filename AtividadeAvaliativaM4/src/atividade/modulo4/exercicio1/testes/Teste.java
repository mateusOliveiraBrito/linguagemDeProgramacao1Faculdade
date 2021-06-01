package atividade.modulo4.exercicio1.testes;

import atividade.modulo4.exercicio1.abstracoes.Assistente;
import atividade.modulo4.exercicio1.funcionarios.Administrativo;
import atividade.modulo4.exercicio1.funcionarios.Gerente;
import atividade.modulo4.exercicio1.funcionarios.Tecnico;

public class Teste {

    public static void main(String[] args) {
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
    }
}
