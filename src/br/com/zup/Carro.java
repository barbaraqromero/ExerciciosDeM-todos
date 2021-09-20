package br.com.zup;

public class Carro {
  String nome;
  double peso;
  String fabricante;
  String cor = "vermelho";
  double valor;

  public Carro() {

  }

  public Carro(String nome, double peso, String fabricante, double valor) {
    this.nome = nome;
    this.peso = peso;
    this.fabricante = fabricante;
    this.valor = valor;
  }

  public double valorDoDesconto() {
    double desconto = valor * 0.5;
    return desconto;
  }

  public void darDesconto() {
    valor = valor - valorDoDesconto();

  }

  public void pintar(String novaCor){
    cor = novaCor;
  }
}
