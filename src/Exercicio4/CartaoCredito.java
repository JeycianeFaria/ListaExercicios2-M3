package Exercicio4;

public class CartaoCredito {

    String nomeCliente;
    double limiteCredito;
    double saldoFatura;

    //metodo construtor
    public CartaoCredito(String nomeCliente, double limiteCredito) {

        this.nomeCliente = nomeCliente;
        this.limiteCredito = limiteCredito;

    }

    //aumentar limite
    public void aumentaLimite(double aumentarLimite) {
        limiteCredito += aumentarLimite;
    }

    //diminuir limite
    public void diminuiLimite(double diminuirLimite) {
        limiteCredito -= diminuirLimite;
    }

    //realizar compra
    public String realizaCompra(double valorCompra) {

        if (limiteCredito > 0 && valorCompra <= limiteCredito) {
            limiteCredito -= valorCompra;
            saldoFatura += valorCompra;
            return "\nCompra efetuada com sucesso!";
        } else {
            return "\nCrédito insuficiente!";
        }

    }

    //imprimir fatura
    public void imprimeFatura(){
        System.out.println("\nNome: " + nomeCliente);
        System.out.println("Limite de Credito: R$ " + limiteCredito);
        System.out.println("Saldo da Fatura: R$ " + saldoFatura);
    }

    //metodo para exibir menu
    public  void exibirMenu(){
        System.out.println("\n=====ZupBank=====\n");
        System.out.println("Digite a opção desejada: ");
        System.out.println("1- Extrato da Fatura.");
        System.out.println("2- ");
    }

}
