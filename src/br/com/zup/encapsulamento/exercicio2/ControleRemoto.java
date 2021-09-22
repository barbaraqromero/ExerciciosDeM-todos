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
  }

  public void diminuirVolume() {
    int volumeDiminuido = tv.getVolume() - 1;
  }

  public void aumentarCanal() {
    int canalAumentado = tv.getCanais() + 1;
  }

  public void diminuirCanal() {
    int canalDiminuido = tv.getCanais() - 1;
  }

  public void canalIndicado() {
    int novoCanal = tv.getCanais();
  }

  public int mostrarCanal() {
    return tv.getCanais();
  }

  public int mostrarVolume() {
    return tv.getVolume();
  }

}
