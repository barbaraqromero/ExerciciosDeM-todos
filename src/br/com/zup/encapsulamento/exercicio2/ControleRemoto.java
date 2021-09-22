package br.com.zup.encapsulamento.exercicio2;

public class ControleRemoto {
  Televisao tv;

  public ControleRemoto() {

  }

  public ControleRemoto(Televisao tv) {
    this.tv = tv;
  }

  public void aumentarVolume() {
    int volumeAumentado = tv.getVolume() + 1;
    tv.setVolume(volumeAumentado);
  }

  public void diminuirVolume() {
    int volumeDiminuido = tv.getVolume() - 1;
    tv.setVolume(volumeDiminuido);
  }

  public void aumentarCanal() {
    int canalAumentado = tv.getCanais() + 1;
    tv.setCanais(canalAumentado);
  }

  public void diminuirCanal() {
    int canalDiminuido = tv.getCanais() - 1;
    tv.setCanais(canalDiminuido);
  }

  public void canalIndicado(int novoCanal) {
    tv.setCanais(novoCanal);
  }

  public void mostrarDados() {
    System.out.println("O canal é: " + tv.getCanais());
    System.out.println("O volume é: " + tv.getVolume());
  }


}
