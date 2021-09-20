package br.com.zup.exercicio4;



public class Main {
  public static void main(String[] args) {
    Cartao cartaoDeCredito = new Cartao("Barbara Queiroz", 1500, 850);

    cartaoDeCredito.mostrarDados();
    System.out.println("----------------------");
    cartaoDeCredito.aumentaLimite(2000);
    System.out.println("Conforme solicitação, seu novo limite é de R$: " + cartaoDeCredito.limite);

    cartaoDeCredito.diminuiLimite(800);
    System.out.println("-----------------------");

    System.out.println("Seu limite foi diminuído, o novo valor é R$ " + cartaoDeCredito.limite);
    System.out.println("-----------------------");

    cartaoDeCredito.realizaCompra(50);
    System.out.println("----------------------");

    System.out.println("Confira sua fatura atual:");
    cartaoDeCredito.imprimirFatura();




  }
}
