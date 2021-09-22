package br.com.zup.encapsulamento.exercicio1;

public class Main {
  public static void main(String[] args) {
    Pessoa novaPessoa = new Pessoa();
    Data dataDeNascimento = new Data(11, 9, 1989);

    novaPessoa.setNome("Bárbara");
    novaPessoa.setAltura(1.62);
    novaPessoa.setDataDeNascimento(dataDeNascimento);
    novaPessoa.calcularIdade(2021);
    novaPessoa.mostrarDados();

  }
}
