package Exercicio4;

public class Main {

    public static void main(String[] args) {

        //instanciando cartões
        CartaoCredito cliente1 = new CartaoCredito("Jeyciane", 1000);

        cliente1.imprimeFatura();
        cliente1.aumentaLimite(1000);
        cliente1.imprimeFatura();
        cliente1.diminuiLimite(500);
        cliente1.imprimeFatura();
        System.out.println(cliente1.realizaCompra(1300));
        cliente1.imprimeFatura();
        System.out.println(cliente1.realizaCompra(1000));
        cliente1.imprimeFatura();

    }

}
