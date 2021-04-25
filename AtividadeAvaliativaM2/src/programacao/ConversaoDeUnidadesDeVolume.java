package programacao;

public class ConversaoDeUnidadesDeVolume {

    //Questao 1
    public void litroParaCmCubicos(Double volumeLitros){
        Double volumeCMCubicos = volumeLitros*1000;
        System.out.println(volumeLitros + " L é equivalente a: " + volumeCMCubicos + " cm3");
    }

    public void metroCubicoParaLitros(Double volumeMetrosCubicos){
        Double volumeLitros = volumeMetrosCubicos * 1000;
        System.out.println(volumeMetrosCubicos + " m3 é equivalente a: " + volumeLitros + " L");
    }

    public void metroCubicoParaPes(Double volumeMetrosCubicos){
        Double volumePes = volumeMetrosCubicos * 35.32;
        System.out.println(volumeMetrosCubicos + " m3 é equivalente a: " + volumePes + " pes cubicos");
    }

    public void galaoAmericanoParaPolegadaCubica(Double volumeGalaoAmericano){
        Double volumePolegadasCubicas = volumeGalaoAmericano * 231;
        System.out.println(volumeGalaoAmericano + " galoes americano é equivalente a: " +
                volumePolegadasCubicas + " polegadas cubicas");
    }

    public void galaoAmericanoParaLitros(Double volumeGalaoAmericano){
        Double volumeLitros = volumeGalaoAmericano * 3.785;
        System.out.println(volumeGalaoAmericano + " galoes americanos é equivalente a: " + volumeLitros + " Litros");
    }
    //Fim da questao 1

    //Questao 2
    public void metroCubicoParaCentimetroCubico(Double volumeMetroCubico){
        Double volumeCentimetroCubico = volumeMetroCubico*1000000;
        System.out.println(volumeMetroCubico + " m3 é equivalente a: " + volumeCentimetroCubico + " cm3");
    }

}
