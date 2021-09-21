package br.com.zup.listaComplementar;

public class Main {
  public static void main(String[] args) {
    //Instanciando a classe Bola
    Bola jabulani = new Bola(10, "borracha");

    //Aplicando os métodos
    jabulani.trocaCor("azul");
    jabulani.mostraCor();

    //Instanciando a classe Quadrado
    Quadrado cubo = new Quadrado(5);

    //Aplicando os métodos
    cubo.mudarValorDoLado(6);
    cubo.retornarValorDoLado();
    cubo.calcularArea();
    System.out.println(cubo.area);

  }
}
