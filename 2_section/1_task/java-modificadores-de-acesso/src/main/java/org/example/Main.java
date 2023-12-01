package org.example;

public class Main {

  public static void main(String[] args) {
    Carro carro1 = new Carro("Hyundai", "HB20", (short) 2022);
    Carro carro2 = new Carro("Hyundai", "HB20", (short) 2022);
    Carro carro3 = new Carro("Hyundai", "HB20", (short) 2022);
    Carro carro4 = new Carro("Hyundai", "HB20", (short) 2022);
    Carro carro5 = new Carro("Hyundai", "HB20", (short) 2022);

    carro1.exibirInformacoes();

    Carro.quantidadeDeCarros();
  }

}