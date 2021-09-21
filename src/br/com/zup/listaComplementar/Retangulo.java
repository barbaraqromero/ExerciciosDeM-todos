package br.com.zup.listaComplementar;

public class Retangulo {
  double base;
  double altura;

  public Retangulo (){

  }

  public Retangulo(double base, double altura){
    this.base = base;
    this.altura = altura;
  }

  public void mudarValorLados(double novaBase, double novaAltura){
    base = novaBase;
    altura = novaAltura;
  }
}
