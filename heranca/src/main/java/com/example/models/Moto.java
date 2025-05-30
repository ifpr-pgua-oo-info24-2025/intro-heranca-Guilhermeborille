package com.example.models;

public class Moto extends Veiculo{
    private String tipoDeGuidao;

    public Moto(String marca, String modelo, int ano, String tipoDeGuidao){
        super(marca, modelo, ano);
        this.tipoDeGuidao = tipoDeGuidao;
    }

    public String getTipoDeGuidao(){
        return this.tipoDeGuidao;
    }
    public void setTipoDeGuidao(String tipoDeGuidao){
        this.tipoDeGuidao = tipoDeGuidao;
    }
    public String exibirDetalhes(){
        return super.exibirDetalhes() + " tipo de guidao: " + this.tipoDeGuidao;
    }
}
