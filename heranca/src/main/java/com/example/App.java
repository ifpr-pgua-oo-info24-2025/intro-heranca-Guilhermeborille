package com.example;
import com.example.models.*;


public class App {
    public static void main(String[] args){
        Carro carro = new Carro("toyota", "corolla", 2021, 4);
        Moto moto = new Moto("honda", "CG 160 fan", 2022, "convencional");
        System.out.println(carro.exibirDetalhes());
        System.out.println(moto.exibirDetalhes());

        carro.setNumeroDePortas(2);
        carro.setAno(1990);

        moto.setTipoDeGuidao("tracker");
        moto.setMarca("yamaha");

        System.out.println("\n" + carro.exibirDetalhes());
        System.out.println(moto.exibirDetalhes());

    }
}
