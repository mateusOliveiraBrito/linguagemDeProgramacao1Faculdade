package atividade.modulo3.exercicio02;

public class Elevador {
    
    private Integer _totalDeAndares;
    private Integer _andarAtual;
    private Integer _capacidadeElevador;
    private Integer _quantidadeAtualDePessoas;
    
    public void Inicialize(Integer capacidadeElevador, Integer totalDeAndares){
        setCapacidadeElevador(capacidadeElevador);
        setTotalDeAndares(totalDeAndares);
    }

    public Integer getTotalDeAndares() {
        return _totalDeAndares;
    }

    public void setTotalDeAndares(Integer _totalDeAndares) {
        this._totalDeAndares = _totalDeAndares;
    }

    public Integer getAndarAtual() {
        return _andarAtual;
    }

    public void setAndarAtual(Integer _andarAtual) {
        this._andarAtual = _andarAtual;
    }

    public Integer getCapacidadeElevador() {
        return _capacidadeElevador;
    }

    public void setCapacidadeElevador(Integer _capacidadeElevador) {
        this._capacidadeElevador = _capacidadeElevador;
    }

    public Integer getQuantidadeAtualDePessoas() {
        return _quantidadeAtualDePessoas;
    }

    public void setQuantidadeAtualDePessoas(Integer _quantidadeAtualDePessoas) {
        this._quantidadeAtualDePessoas = _quantidadeAtualDePessoas;
    }
    
    public void Entra(){
        if (_quantidadeAtualDePessoas < _capacidadeElevador){
            _quantidadeAtualDePessoas++;
            return;
        }
        
        System.out.println("A capacidade máxima já foi atingida!");
    }
    
    public void Sai(){
        if (_quantidadeAtualDePessoas > 0){
            _quantidadeAtualDePessoas--;
            return;
        }
        
        System.out.println("Não há ninguém no elevador!");
    }
    
    public void Sobe(){
        if (_andarAtual < _totalDeAndares){
            _andarAtual++;
            return;
        }
        
        System.out.println("O elevador já se encontra no último andar!");
    }
    
    public void Desce(){
        int terreo = 0;
        if (_andarAtual > terreo){
            _andarAtual--;
            return;
        }
        
        System.out.println("O elevador já se encontra no térreo!");
    }
    
    public void imprimaEstadoAtual(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("Total de andares: " + _totalDeAndares + " andares");
        sb.append("Andar atual: " + _andarAtual + "° andar");
        sb.append("Capacidade máxima: " + _capacidadeElevador + " pessoas");
        sb.append("Quantidade atual de pessoas: " + _quantidadeAtualDePessoas);
    }
}