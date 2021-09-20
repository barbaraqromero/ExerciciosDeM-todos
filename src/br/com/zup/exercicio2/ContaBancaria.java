package br.com.zup.exercicio2;

public class ContaBancaria {
  String nomeDoCorrentista;
  int numeroDaConta;
  double saldo = 0;

  public ContaBancaria(){

  }

  public ContaBancaria(String nomeDoCorrentista, int numeroDaConta){
    this.nomeDoCorrentista = nomeDoCorrentista;
    this.numeroDaConta = numeroDaConta;
  }

}
