package br.com.zup.exercicio3;

public class Elevador {
  private int andarAtual = 0;
  private int totalDeAndares;
  private int capacidadeDoElevador;
  private int quantidadeDePessoas;

  public Elevador() {

  }

  public int getAndarAtual() {
    return andarAtual;
  }

  public int getTotalDeAndares() {
    return totalDeAndares;
  }

  public int getCapacidadeDoElevador() {
    return capacidadeDoElevador;
  }

  public int getQuantidadeDePessoas() {
    return quantidadeDePessoas;
  }

  public void setAndarAtual(int andarAtual) {
    this.andarAtual = andarAtual;
  }

  public void setCapacidadeDoElevador(int capacidadeDoElevador) {
    this.capacidadeDoElevador = capacidadeDoElevador;
  }

  public void setQuantidadeDePessoas(int quantidadeDePessoas) {
    this.quantidadeDePessoas = quantidadeDePessoas;
  }

  public void setTotalDeAndares(int totalDeAndares) {
    this.totalDeAndares = totalDeAndares;
  }

  public Elevador(int totalDeAndares, int capacidadeDoElevador) {
    this.totalDeAndares = totalDeAndares;
    this.capacidadeDoElevador = capacidadeDoElevador;
    this.quantidadeDePessoas = quantidadeDePessoas;

  }

  public void entra(int novaPessoa) {
    if (novaPessoa <= 8) {
      quantidadeDePessoas = quantidadeDePessoas + novaPessoa;
    } else {
      System.out.println("Não é permitido ultrapassar a capacidade máxima de pessoas!");
    }

  }

  public void sai(int pessoaSai) {
    if (pessoaSai > 0 & pessoaSai <= 8) {
      quantidadeDePessoas = quantidadeDePessoas - pessoaSai;
    }

  }

  public void sobe(int subirAndar) {
    if (subirAndar < 12) {
      andarAtual = andarAtual + subirAndar;
    } else {
      System.out.println("O último andar é o 12º!");
    }

  }

  public void desce(int descerAndar) {
    if (descerAndar > 0 & descerAndar < 12) {
      andarAtual = descerAndar;
    } else {
      System.out.println("NÃO HÁ PARA ONDE DESCER ALÉM DO 0!");
    }
  }
}
