package br.com.zup.listaComplementar;

public class Pessoa {
  String nome;
  int idade;
  double peso;
  double altura;
  int novaIdade;
  double novoPeso;

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

  public void emagrecer(double emagrecer){
    novoPeso = novoPeso - emagrecer;
  }
}
