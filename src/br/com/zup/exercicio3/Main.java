package br.com.zup.exercicio3;

public class Main {
  public static void main(String[] args) {
    Elevador elevador = new Elevador(12, 8);

    elevador.entra(8);
    System.out.println("A quantidade atual de pessoas é: " + elevador.quantidadeDePessoas);
    System.out.println("-------------------------");

    elevador.sai(3);
    System.out.println("Depois das saídas, a quantidade de pessoas passou a ser: " + elevador.quantidadeDePessoas);
    System.out.println("-------------------------");

    elevador.sobe(8);
    System.out.println("Subindo ao andar escolhido: " + elevador.andarAtual);
    System.out.println("-------------------------");

    elevador.desce(5);
    System.out.println("Descendo ao andar escolhido: " + elevador.andarAtual);
  }


}

