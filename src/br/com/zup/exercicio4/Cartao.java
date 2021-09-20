package br.com.zup.exercicio4;

public class Cartao {
  String nomeDoTitular;
  double limite;
  double saldo = 850;

  public Cartao(){

  }

  public Cartao (String nomeDoTitular, double limite){
    this.nomeDoTitular = nomeDoTitular;
    this.limite = limite;
  }
}
