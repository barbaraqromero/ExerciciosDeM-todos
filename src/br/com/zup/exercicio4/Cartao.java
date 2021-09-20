package br.com.zup.exercicio4;

public class Cartao {
  String nomeDoTitular;
  double limite;
  double saldo;

  public Cartao() {

  }

  public Cartao(String nomeDoTitular, double limite, double saldo) {
    this.nomeDoTitular = nomeDoTitular;
    this.limite = limite;
    this.saldo = saldo;
  }

  public void mostrarDados() {
    System.out.println("Nome do titular do cartão: " + nomeDoTitular);
    System.out.println("Limite do cartão: R$ " + limite);
    System.out.println("Saldo atual do cartão: R$ " + saldo);
  }

  public void aumentaLimite(double novoLimite) {
    limite = novoLimite;
  }

  public void diminuiLimite(double menorLimite) {
    limite = limite - menorLimite;
  }

  public void realizaCompra(double valorCompra) {
    if (valorCompra <= limite) {
      System.out.println("Parabéns, compra realizada com sucesso!");
      limite = limite - valorCompra;
      saldo = saldo + valorCompra;
    } else {
      System.out.println("Infelizmente, o saldo é insuficiente para realizar sua compra!");
    }

  }
  public void imprimirFatura(){
    System.out.println("Limite atual: R$ " + limite);
    System.out.println("Valor da fatura: R$ " + saldo);

  }
}
