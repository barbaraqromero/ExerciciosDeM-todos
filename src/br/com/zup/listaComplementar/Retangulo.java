package br.com.zup.listaComplementar;

public class Retangulo {
  double base;
  double altura;
  double area;
  double perimetro;

  public Retangulo() {

  }

  public Retangulo(double base, double altura) {
    this.base = base;
    this.altura = altura;
  }

  public void mudarValorLados(double novaBase, double novaAltura) {
    base = novaBase;
    altura = novaAltura;
  }

  public void retornarValores() {
    System.out.println("A base é: " + base);
    System.out.println("A altura é: " + altura);

  }

  public void calcularArea(){
    area = base * altura;
    System.out.println("A área é: " + area);

  }

  public void calcularPerimetro(){
    perimetro = (base * 2) + (altura * 2);
    System.out.println("O perímetro é: " + perimetro);

  }
}
