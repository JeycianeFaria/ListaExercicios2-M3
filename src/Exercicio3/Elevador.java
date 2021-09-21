package Exercicio3;

public class Elevador {

    int terreo = 0;
    int andarAtual = terreo;
    int totalAndares;
    int capacidadeElevador;
    int qtdPessoasDentro;


    //metodo construtor
    public Elevador(int totalAndares, int capacidadeElevador, int qtdPessoasDentro) {
        this.totalAndares = totalAndares;
        this.capacidadeElevador = capacidadeElevador;
        this.qtdPessoasDentro = qtdPessoasDentro;
    }

    //metodo para exibir o elevador
    public void exibirElevador() {
        System.out.println("\nO elevador está no andar : " + andarAtual);
        System.out.println("Quantidade de pessoas dentro:  " + qtdPessoasDentro);
        System.out.println("O numero de andares: " + totalAndares);
        System.out.println("A capacidade maxima de pessoas: " + capacidadeElevador);
    }

    //metodo para entrar no elevador
    public String entrarElevador(int qtdEntrar) {

        int totalPessoas = qtdPessoasDentro + qtdEntrar;

        if (totalPessoas <= capacidadeElevador) {
            qtdPessoasDentro += qtdEntrar;
            return "\nAinda há espaço, pode entrar!";

        } else {
            return "\nO elevador está lotado, aguarde o proximo!";
        }

    }

    //metodo para sair do Elevador
    public String sairElevador(int qtdSair) {

        if (qtdPessoasDentro > 0) {

            qtdPessoasDentro -= qtdSair;
            return "\nTchau, tchau!";

        } else {
            return "\nO elevador está vazio!";
        }

    }

    //metodo para o elevador subir
    public String subirElevador() {

        if (andarAtual < totalAndares) {

            andarAtual++;
            return "Subindo!";

        } else {
            return "O elevador está no ultimo andar!";
        }

    }

    //metodo para o elevador descer
    public String descerElevador() {

        if (andarAtual > terreo) {

            andarAtual--;
            return "Descendo!";

        } else {
            return "O elevador está no térreo";
        }

    }

}
