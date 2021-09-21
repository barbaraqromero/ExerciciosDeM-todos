package br.com.zup.listaComplementar;

public class Quadrado {
  double tamanhoDoLado;

  public Quadrado() {

  }

  public Quadrado(double tamanhoDoLado) {
    this.tamanhoDoLado = tamanhoDoLado;

  }

  public void mudarValorDoLado(double novoValorDoLado) {
    tamanhoDoLado = novoValorDoLado;
  }

  public void retornarValorDoLado() {
    System.out.println(tamanhoDoLado);
  }

  }

  //public void calcularArea() {

 // }
//}




