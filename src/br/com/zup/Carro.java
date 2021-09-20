package br.com.zup;

public class Carro {
  String nome;
  double peso;
  String fabricante;
  String cor;
  double valor;

  public Carro(){

  }

  public Carro(String nome, double peso, String fabricante, String cor, double valor){
    this.nome= nome;
    this.peso = peso;
    this.fabricante = fabricante;
    this.cor = cor;
    this.valor = valor;
  }
}
