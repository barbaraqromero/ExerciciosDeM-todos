package br.com.zup.listaComplementar;

public class Main {
  public static void main(String[] args) {
    //Instanciando a classe Bola
    Bola jabulani = new Bola(10, "borracha");

    //Aplicando os métodos
    jabulani.trocaCor("azul");
    jabulani.mostraCor();

    //Instanciando a classe Quadrado
    Quadrado cubo = new Quadrado(120);

    cubo.mudarValorDoLado(150);
    System.out.println(cubo.tamanhoDoLado);

  }
}
