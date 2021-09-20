package br.com.zup.exercicio3;

public class Elevador {
  int andarAtual = 0;
  int totalDeAndares;
  int capacidadeDoElevador;
  int quantidadeDePessoas;

  public Elevador() {

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
    if (descerAndar > 0 & descerAndar <= 12) {
      andarAtual = descerAndar;
    } else {
      System.out.println("NÃO HÁ PARA ONDE DESCER ALÉM DO 0!");
    }
  }
}
