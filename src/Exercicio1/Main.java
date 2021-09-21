package Exercicio1;

public class Main {

    public static void main(String[] args) {

        //instanciando carro
        Carro carro1 = new Carro("Golf GTI", "Volkswagen", "Preto", 1000,50000);


        carro1.exibirCarro();
        carro1.darDesconto(0.2);
        carro1.atribuirDesconto();
        carro1.pintarCarro("Vermelho");
        carro1.exibirCarro();

    }

}
