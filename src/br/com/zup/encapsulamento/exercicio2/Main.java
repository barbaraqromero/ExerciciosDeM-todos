package br.com.zup.encapsulamento.exercicio2;

public class Main {
  public static void main(String[] args) {
    Televisao tv = new Televisao(5, 12);
    ControleRemoto controle = new ControleRemoto(tv);

    controle.aumentarCanal();
    controle.aumentarVolume();
    controle.mostrarDados();
    controle.diminuirCanal();
    controle.diminuirVolume();
    controle.mostrarDados();
    controle.canalIndicado(26);
    controle.mostrarDados();

  }
}
