package Exercicio3;

public class Main {

    public static void main(String[] args) {

        //instanciando elevador
        Elevador elevador1 = new Elevador(10,8);

        elevador1.exibirElevador();
        elevador1.entrarElevador(15);
        elevador1.exibirElevador();
        elevador1.sairElevador(6);
        elevador1.exibirElevador();
        elevador1.subirElevador(8);
        elevador1.exibirElevador();
        elevador1.descerElevador(5);
    }

}
