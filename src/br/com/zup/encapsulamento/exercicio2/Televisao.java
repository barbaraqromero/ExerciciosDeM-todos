package br.com.zup.encapsulamento.exercicio2;

public class Televisao {
  private int canais;
  private int volume;

  public Televisao() {

  }

  public Televisao(int canais, int volume) {
    this.canais = canais;
    this.volume = volume;
  }

  public int getCanais() {
    return canais;
  }

  public void setCanais(int canais) {
    this.canais = canais;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }
}
