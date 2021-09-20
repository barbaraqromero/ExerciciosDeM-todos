package br.com.zup.exercicio3;

public class Elevador {
  int andarAtual = 0;
  int totalDeAndares;
  int capacidadeDoElevador;
  int quantidadeDePessoas;

  public Elevador(){

  }

  public Elevador(int totalDeAndares, int capacidadeDoElevador, int quantidadeDePessoas){
    this.totalDeAndares = totalDeAndares;
    this.capacidadeDoElevador = capacidadeDoElevador;
    this.quantidadeDePessoas = quantidadeDePessoas;

  }
}
