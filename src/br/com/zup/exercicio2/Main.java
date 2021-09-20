package br.com.zup.exercicio2;

public class Main {
  public static void main(String[] args) {
    ContaBancaria cc1 = new ContaBancaria("Barbara Queiroz", 255);

    cc1.saldo = 3600;

    cc1.mostrarDados();
    System.out.println("---------------------------");

    cc1.saque(500);
    cc1.mostrarDados();
    System.out.println("----------------------------");

    cc1.deposito(1000);
    cc1.mostrarDados();
    System.out.println("----------------------------");

    cc1.extrato();
  }
}
