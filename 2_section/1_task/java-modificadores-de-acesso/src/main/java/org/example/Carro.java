package org.example;

public class Carro {
  private static int contador = 0;
  private String marca = "";
  private String modelo = "";
  private short ano = 2000;

  public Carro(String marca, String modelo, short ano) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    contador++;
  }

  public static void quantidadeDeCarros() {
    System.out.println("A quantidade de carros criados é de: " + contador);
  }

  public void exibirInformacoes() {
    System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public short getAno() {
    return ano;
  }

  public void setAno(short ano) {
    this.ano = ano;
  }
}
