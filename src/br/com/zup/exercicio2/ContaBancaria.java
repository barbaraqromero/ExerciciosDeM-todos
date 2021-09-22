package br.com.zup.exercicio2;

public class ContaBancaria {
  private String nomeDoCorrentista;
  private int numeroDaConta;
  private double saldo = 0;

  public ContaBancaria() {

  }

  public ContaBancaria(String nomeDoCorrentista, int numeroDaConta) {
    this.nomeDoCorrentista = nomeDoCorrentista;
    this.numeroDaConta = numeroDaConta;
  }

  public String getNomeDoCorrentista() {
    return nomeDoCorrentista;
  }

  public int getNumeroDaConta() {
    return numeroDaConta;
  }

  public double getSaldo() {
    return saldo;
  }

  public void mostrarDados() {
    System.out.println("Nome do Titular: " + nomeDoCorrentista);
    System.out.println("Número da Conta: " + numeroDaConta);
    System.out.println("Saldo atual: " + saldo);
  }

  public void saque(double valor) {

    saldo = saldo - valor;
  }

  public void deposito(double valor) {
    saldo = saldo + valor;
  }
}

