package Exercicio3;

public class Main {

    public static void main(String[] args) {

        //instanciando elevador
        Elevador elevador1 = new Elevador(10,8,0);

        elevador1.exibirElevador();
        System.out.println(elevador1.entrarElevador(5));
        elevador1.exibirElevador();
        System.out.println(elevador1.entrarElevador(5));
        elevador1.exibirElevador();
        System.out.println(elevador1.sairElevador(2));
        elevador1.exibirElevador();
        System.out.println(elevador1.subirElevador());
        System.out.println(elevador1.subirElevador());
        elevador1.exibirElevador();
        System.out.println(elevador1.descerElevador());
        elevador1.exibirElevador();

    }

}
