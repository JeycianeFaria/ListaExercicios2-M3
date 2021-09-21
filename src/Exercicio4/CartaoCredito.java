package Exercicio4;

public class CartaoCredito {

    String nomeCliente;
    double limiteCredito;
    double saldoFatura;

    public CartaoCredito(String nomeCliente, double limiteCredito) {

        this.nomeCliente = nomeCliente;
        this.limiteCredito = limiteCredito;

    }

    public void aumentaLimite(double aumentarLimite) {
        limiteCredito += aumentarLimite;
    }

    public void diminuiLimite(double diminuirLimite) {
        limiteCredito -= diminuirLimite;
    }

    public String realizaCompra(double valorCompra) {

        if (limiteCredito > 0 && valorCompra <= limiteCredito) {
            limiteCredito -= valorCompra;
            saldoFatura += valorCompra;
            return "\nCompra efetuada com sucesso!";
        } else {
            return "\nCrédito insuficiente!";
        }

    }

    public void imprimeFatura(){
        System.out.println("\nNome: " + nomeCliente);
        System.out.println("Limite de Credito: R$ " + limiteCredito);
        System.out.println("Saldo da Fatura: R$ " + saldoFatura);
    }

}
