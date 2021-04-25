package programacao;

public class Piscina {
    private ConversaoDeUnidadesDeVolume conversao = new ConversaoDeUnidadesDeVolume();

    Piscina(int volumeEmMetrosCubicos){
        conversao.metroCubicoParaLitros(Double.parseDouble(volumeEmMetrosCubicos + ""));
        conversao.metroCubicoParaPes(Double.parseDouble(volumeEmMetrosCubicos + ""));
        conversao.metroCubicoParaCentimetroCubico(Double.parseDouble(volumeEmMetrosCubicos + ""));
    }
}
