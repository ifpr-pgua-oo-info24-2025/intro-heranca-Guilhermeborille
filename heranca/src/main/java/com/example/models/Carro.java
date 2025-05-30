package com.example.models;

public class Carro extends Veiculo{

    private int numeroDePortas;

    public Carro(String marca, String modelo, int ano, int numeroDePortas){
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }
    public int getNumeroDePortas(){
        return this.numeroDePortas;
    }
    public void setNumeroDePortas(int numeroDePortas){
        this.numeroDePortas = numeroDePortas;
    }
    public String exibirDetalhes(){
        return super.exibirDetalhes() + " numero de portas: " + this.numeroDePortas;
    }
    
}
