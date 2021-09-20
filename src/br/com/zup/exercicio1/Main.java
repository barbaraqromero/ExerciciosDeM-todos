package br.com.zup.exercicio1;

import br.com.zup.exercicio1.Carro;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    String novaCor;

    //Instanciando a classe Carro
    Carro jipe = new Carro("Wrangler", 2000, "Jeep", 370000);

    //Exibindo valor sem desconto
    System.out.println("O valor atual do seu jipe é: ");
    System.out.println(jipe.valor);

    //Aplicando desconto e exibindo novo valor
    System.out.println("O valor do seu jipe com o desconto aplicado é: ");
    jipe.darDesconto();
    System.out.println(jipe.valor);
    System.out.println("-------------------------------------");

    //Exibindo cor padrão
    System.out.println("A cor padrão do eu jipe é: ");
    System.out.println(jipe.cor);
    System.out.println("-------------------------------------");

    //Exibindo nova cor
    System.out.println("Deseja alterar a cor padrão?");
    System.out.println("Digite a cor escolhida: ");
    novaCor = leitor.nextLine();
    jipe.pintar(novaCor);
    System.out.println("A nova cor do seu jipe é: ");
    System.out.println(jipe.cor);

  }
}
