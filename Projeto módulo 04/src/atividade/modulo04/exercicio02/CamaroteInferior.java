package atividade.modulo04.exercicio02;

public class CamaroteInferior extends VIP {
    
    private String localizacao;
    
    public CamaroteInferior(Double valor, String localizacao){
        super(valor);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
    public String imprimeLocalizacao(){
        return "Localização: " + this.localizacao;
    }
}
