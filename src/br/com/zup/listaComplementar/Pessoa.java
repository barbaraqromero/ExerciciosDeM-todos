package br.com.zup.listaComplementar;

public class Pessoa {
  String nome;
  int idade;
  double peso;
  double altura;
  int novaIdade;
  double novoPeso;
  double novaAltura;

  public Pessoa() {

  }

  public Pessoa(String nome, int idade, double peso, double altura) {
    this.nome = nome;
    this.idade = idade;
    this.peso = peso;
    this.altura = altura;
  }

  public void envelhecer(int envelhecer) {
    novaIdade = idade + envelhecer;
  }

  public void engordar(double engordar) {
    novoPeso = peso + engordar;
  }

  public void emagrecer(double emagrecer) {
    novoPeso = novoPeso - emagrecer;
  }

  public void crescer(double crescer) {
    novaAltura = altura + crescer;
    if (novaIdade < 21) {
      novaAltura = altura + 0.5;
    }

    else if (novaAltura > 21){
      novaAltura = altura + crescer;
    }

  }
}
