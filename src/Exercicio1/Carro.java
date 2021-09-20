package Exercicio1;

import javax.sound.midi.Soundbank;

public class Carro {

    String nome;
    String fabricante;
    String cor;
    double peso;
    double valorCarro;
    double valorDesconto = 0;


    public Carro(String nome, String fabricante, String cor, double peso, double valorCarro) {

        this.nome = nome;
        this.fabricante = fabricante;
        this.cor = cor;
        this.peso = peso;
        this.valorCarro = valorCarro;

    }

    public void exibirCarro() {
        System.out.println("\n=======================\n");
        System.out.println("Carro: " + nome);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Cor: " + cor);
        System.out.println("Peso: " + peso + " Kg");
        System.out.println("Valor do Desconto: " + valorDesconto);
        System.out.println("Valor: R$ " + valorCarro);
    }

    public void darDesconto(double desconto) {
        valorDesconto = desconto * valorCarro;
        valorCarro = valorCarro - valorDesconto;
    }

    public void pintarCarro(String corDesejada){
        cor = corDesejada;
    }

}
