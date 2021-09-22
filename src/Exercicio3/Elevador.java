package Exercicio3;

public class Elevador {

    int terreo = 0;
    int andarAtual = terreo;
    int totalAndares;
    int capacidadeElevador;
    int qtdPessoasDentro;


    //metodo construtor
    public Elevador(int totalAndares, int capacidadeElevador) {
        this.totalAndares = totalAndares;
        this.capacidadeElevador = capacidadeElevador;
    }

    //metodo para exibir o elevador
    public void exibirElevador() {
        System.out.println("\nO elevador está no andar : " + andarAtual);
        System.out.println("Quantidade de pessoas dentro:  " + qtdPessoasDentro);
        System.out.println("Número de andares: " + totalAndares);
        System.out.println("Capacidade maxima de pessoas: " + capacidadeElevador);
    }

    //metodo para entrar no elevador
    public void entrarElevador(int qtdEntrar) {

        int totalPessoas = qtdPessoasDentro + qtdEntrar;

        if (totalPessoas <= capacidadeElevador) {
            qtdPessoasDentro = totalPessoas;
            System.out.println("\nAinda há espaço, pode entrar!");

        } else if (totalPessoas > capacidadeElevador) {
            System.out.println("\nO elevador não comporta essa quantidade de pessoas!");
            System.out.println("\nA capacidade maxima de pessoas é de : " + capacidadeElevador);
        } else {
            System.out.println("\nO elevador está lotado, aguarde o proximo!");
            System.out.println("Quantidade de pessoas dentro do elevador = " + qtdPessoasDentro);
        }

    }

    //metodo para sair do Elevador
    public void sairElevador(int qtdSair) {

        int pessoasSaindo = qtdPessoasDentro - qtdSair;

        if (pessoasSaindo > 0) {
            qtdPessoasDentro -= qtdSair;
            System.out.println("\nTchau, tchau!");

        } else if (qtdSair > qtdPessoasDentro && qtdPessoasDentro != 0) {
            System.out.println("\nNão é possivel sair mais pessoas do que as que estão dentro do elevador!");
            System.out.println("Quantidade de pessoas dentro do elevador = " + qtdPessoasDentro);

        } else {
            System.out.println("\nO elevador está vazio!");
        }

    }

    //metodo para o elevador subir
    public void subirElevador(int andarDesejado) {

        if (andarDesejado > terreo && andarAtual < andarDesejado) {

            if (andarDesejado <= totalAndares && andarAtual < totalAndares) {

                andarAtual = andarDesejado;
                System.out.println("\nSubindo para o  " + andarDesejado + "º andar!");

            } else {
                System.out.println("\nO elevador está no ultimo andar!");
            }

        } else {
            System.out.println("\nPara subir digite um andar acima do andar atual!");
        }

    }

    //metodo para o elevador descer
    public void descerElevador(int andarDesejado) {

        if (andarDesejado < totalAndares && andarAtual > andarDesejado) {

            if (andarDesejado >= terreo ) {

                andarAtual = andarDesejado;
                System.out.println("\nDescendo para o " + andarDesejado + "º andar");

            } else {
                System.out.println("\nO elevador está no térreo");
            }

        } else {
            System.out.println("\nPara descer digite um valor abaixo do andar atual!");
        }

    }

}
