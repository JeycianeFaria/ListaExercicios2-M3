package Exercicio2;

public class ContaBancaria {

    String nomeCorrentista;
    String numeroConta;
    double saldoConta;

    //metodo construtor
    public ContaBancaria(String nomeCorrentista, String numeroConta, double saldoConta){
        this.nomeCorrentista = nomeCorrentista;
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
    }

    //metodo saque
    public void saque(double valorSaque){
        saldoConta -= valorSaque;
    }

    //metodo deposito
    public void deposito(double valorDeposito){
        saldoConta += valorDeposito;
    }


    //metodo exibir o extrato
    public void extrato(){
        System.out.println("\nNome Correntista: " + nomeCorrentista);
        System.out.println("Numero da Conta: " + numeroConta);
        System.out.println("Saldo: " + saldoConta);
    }

}
