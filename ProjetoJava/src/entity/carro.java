package entity;

public class carro {
    private int codigoCarro;
    private String modelo;
    private String marca;
    private int ano;
    private int capacidade;
    private String tipo_transmissao;
    private int preco_aluguel;
    private Boolean disponivel;

    public int getCodigoCarro() {
        return codigoCarro;
    }

    public void setCodigoCarro(int codigoCarro) {
        this.codigoCarro = codigoCarro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano; 
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }

    public String getTipoTransmissao(){
        return tipo_transmissao;
    }

    public void setTipoTransmissao(String tipo_transmissao) {
        this.tipo_transmissao = tipo_transmissao;
    }

    public int getPrecoAluguel() {
        return preco_aluguel;
    }

    public void setPrecoAluguel(int preco_aluguel) {
        this.preco_aluguel = preco_aluguel;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }
}
