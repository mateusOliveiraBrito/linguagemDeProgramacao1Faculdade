package programacao;

public class Teste {

    public static void main(String[] args) {

        /*
        * Grupo de Programacao:
        * Marcos Paulo Soares Rezende
        * Mateus Oliveira
        * Rosiane Ferreira
        * */

        ConversaoDeUnidadesDeVolume conversaoDeUnidades = new ConversaoDeUnidadesDeVolume();

        System.out.println("==========Questao 1==========\n");

        //Conversao de litros para centimetros cubicos
        conversaoDeUnidades.litroParaCmCubicos(1D);
        conversaoDeUnidades.litroParaCmCubicos(2.5D);
        System.out.println("---------------------\n");

        //Conversao de metros cubicos para litros
        conversaoDeUnidades.metroCubicoParaLitros(1D);
        conversaoDeUnidades.metroCubicoParaLitros(3.07D);
        System.out.println("---------------------\n");

        //Conversao de metros cubicos para pes cubicos
        conversaoDeUnidades.metroCubicoParaPes(1D);
        conversaoDeUnidades.metroCubicoParaPes(2.3D);
        System.out.println("---------------------\n");

        //Conversao de galao americano para polegadas cubicas
        conversaoDeUnidades.galaoAmericanoParaPolegadaCubica(1D);
        conversaoDeUnidades.galaoAmericanoParaPolegadaCubica(2.4D);
        System.out.println("---------------------\n");

        //Conversao de galao americano para litros
        conversaoDeUnidades.galaoAmericanoParaLitros(1D);
        conversaoDeUnidades.galaoAmericanoParaLitros(3.1D);
        System.out.println("---------------------\n");

        System.out.println("==========Questao 1==========\n");

        Piscina p = new Piscina(2);
    }
}
