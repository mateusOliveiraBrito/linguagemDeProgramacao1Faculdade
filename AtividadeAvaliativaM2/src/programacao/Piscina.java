package programacao;

public class Piscina {

    Piscina(int volumeEmMetrosCubicos) {
        setVolumeEmMetrosCubicos(volumeEmMetrosCubicos);
        realizeConversoes();
    }

    private ConversaoDeUnidadesDeVolume conversao = new ConversaoDeUnidadesDeVolume();
    private Integer volumeEmMetrosCubicos;

    public void setVolumeEmMetrosCubicos(int volume) {
        volumeEmMetrosCubicos = volume;
    }

    public Integer getVolumeEmMetrosCubicos() {
        return volumeEmMetrosCubicos;
    }
    
    private void realizeConversoes(){
        conversao.metroCubicoParaLitros(Double.parseDouble(getVolumeEmMetrosCubicos() + ""));
        conversao.metroCubicoParaPes(Double.parseDouble(getVolumeEmMetrosCubicos() + ""));
        conversao.metroCubicoParaCentimetroCubico(Double.parseDouble(getVolumeEmMetrosCubicos() + ""));
    }
}
