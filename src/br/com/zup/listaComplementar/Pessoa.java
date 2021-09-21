package br.com.zup.listaComplementar;

public class Pessoa {
  String nome;
  int idade;
  double peso;
  double altura;
  int novaIdade;

  public Pessoa(){

  }

  public Pessoa(String nome, int idade, double peso, double altura){
    this.nome = nome;
    this.idade = idade;
    this.peso = peso;
    this.altura = altura;
  }

  public void envelhecer(int envelhecer){
    novaIdade = idade + envelhecer;
  }
}
