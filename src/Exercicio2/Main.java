package Exercicio2;

public class Main {

    public static void main(String[] args) {

        //instanciando contas
        ContaBancaria conta1 = new ContaBancaria("Jeyciane", "415263", 100);


        conta1.extrato();
        conta1.deposito(500);
        conta1.extrato();
        conta1.saque(50);
        conta1.extrato();

    }

}
