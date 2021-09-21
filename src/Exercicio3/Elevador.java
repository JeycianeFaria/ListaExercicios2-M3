package Exercicio3;

public class Elevador {

    int terreo = 0;
    int andarAtual = terreo;
    int totalAndares;
    int capacidadeElevador;
    int qtdPessoasDentro;

    public Elevador(int totalAndares, int capacidadeElevador, int qtdPessoasDentro){
        this.totalAndares = totalAndares;
        this.capacidadeElevador = capacidadeElevador;
        this.qtdPessoasDentro = qtdPessoasDentro;
    }

    public void exibirElevador(){
        System.out.println("\nO elevador está no andar : " + andarAtual);
        System.out.println("Quantidade de pessoas dentro:  " + qtdPessoasDentro);
        System.out.println("O numero de andares: " + totalAndares);
        System.out.println("A capacidade maxima de pessoas: " + capacidadeElevador);
    }

    public String entrarElevador(int qtdEntrar){
        if (qtdPessoasDentro < capacidadeElevador  && qtdEntrar <= capacidadeElevador){
            qtdPessoasDentro += qtdEntrar;
            return "\nAinda há espaço, pode entrar!";
        }else{
            return "\nO elevador está lotado, aguarde o proximo!";
        }
    }

    public String sairElevador(int qtdSair){
        if (qtdPessoasDentro > 0){
            qtdPessoasDentro -= qtdSair;
            return "\nTchau, tchau!";
        }else {
            return "\nO elevador está vazio!";
        }
    }

    public String subirElevador(){
        if (andarAtual < totalAndares){
            andarAtual++;
            return "Subindo!";
        }else{
            return "O elevador está no ultimo andar!";
        }
    }

    public String descerElevador(){
        if (andarAtual > terreo){
            andarAtual--;
            return "Descendo!";
        }else {
            return "O elevador está no térreo";
        }
    }

}
