package Exercicio2;

public class ContaBancaria {

    String nomeCorrentista;
    String numeroConta;
    double saldoConta;

    public ContaBancaria(String nomeCorrentista, String numeroConta, double saldoConta){
        this.nomeCorrentista = nomeCorrentista;
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
    }

    public void saque(double valorSaque){
        saldoConta -= valorSaque;
    }

    public void deposito(double valorDeposito){
        saldoConta += valorDeposito;
    }

    public void extrato(){
        System.out.println("\nNome Correntista: " + nomeCorrentista);
        System.out.println("Numero da Conta: " + numeroConta);
        System.out.println("Saldo: " + saldoConta);
    }

}
