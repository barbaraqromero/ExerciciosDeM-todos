package br.com.zup.exercicio1;

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

  public void mostrarCarro(){
    System.out.println("O modelo do carro é: " + nome);
    System.out.println("O peso do carro é: " + peso);
    System.out.println("O fabricante do carro é: " + fabricante);
    System.out.println("O valor do carro é: " + valor);
  }

  public double valorDoDesconto() {
    double desconto = valor * 0.5;
    return desconto;
  }

  public void darDesconto() {
    valor = valor - valorDoDesconto();

  }

  public void pintar(String novaCor) {
    cor = novaCor;
  }
}
