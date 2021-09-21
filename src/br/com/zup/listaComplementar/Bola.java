package br.com.zup.listaComplementar;

public class Bola {
  String cor = "rosa";
  double circunferencia;
  String material;

  public Bola() {

  }

  public Bola(double circunferencia, String material) {
    this.cor = cor;
    this.circunferencia = circunferencia;
    this.material = material;

  }

  public void mostrarDados() {
    System.out.println("A cor da bola é: " + cor);
    System.out.println("A circunferência da bola é: " + circunferencia);
    System.out.println("O material da bola é: " + material);
  }

  public void trocaCor(String novaCor) {
    cor = novaCor;
  }

  public void mostraCor() {
    System.out.println("A cor atual da bola é: " + cor);

  }
}
