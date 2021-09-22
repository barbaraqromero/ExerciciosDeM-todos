package br.com.zup.encapsulamento.exercicio2;

public class ControleRemoto {
  Televisao tv;

  public ControleRemoto(){

  }

  public ControleRemoto(Televisao tv) {
    this.tv = tv;
  }

  public void aumentarVolume(){
    int volumeAumentado = tv.getVolume() + 1;
  }

}
