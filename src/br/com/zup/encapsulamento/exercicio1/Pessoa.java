package br.com.zup.encapsulamento.exercicio1;

import br.com.zup.encapsulamento.exercicio1.Data;

public class Pessoa {
  private String nome;
  private Data dataDeNascimento;
  private double altura;
  private int idade;

  public Pessoa () {

  }

  public Pessoa (String pessoa, Data dataDeNascimento, double altura){
    this.nome = nome;
    this.dataDeNascimento = dataDeNascimento;
    this.altura = altura;

  }

  public String getNome(){
    return nome;
  }

  public Data getDataDeNascimento(){
    return dataDeNascimento;
  }
  public double getAltura(){
    return getAltura();
  }


  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setDataDeNascimento(Data dataDeNascimento) {
    this.dataDeNascimento = dataDeNascimento;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public void calcularIdade(int anoAtual){
    idade = anoAtual - dataDeNascimento.getAno();


  }

  public void mostrarDados(){
    System.out.println("Seu nome é: " + nome);
    System.out.println("Sua data de nascimento é: " + dataDeNascimento.getDia() + "/" + dataDeNascimento.getMes() + "/" + dataDeNascimento.getAno());
    System.out.println("Sua idade é: " + idade);
    System.out.println("Sua altura é: " + altura);
  }
}
