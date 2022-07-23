package pacotes;
/*
classe de exemplo para o exercício da aula 3 de Orientação Objetos.
*/

public class Carro {
    //atributos
    String cor;
    String modelo;
    int capacidadeTanque;

    public Carro(){

    }

    public Carro(String cor, String modelo, int capacidadeTanque){
     this.cor = cor;
     this.modelo = modelo;
     this.capacidadeTanque = capacidadeTanque;
    }

  //me retorne a cor
    public String getCor() {
        return cor;
    }
  //pode alterar
    public void setCor(String cor) {
        this.cor = cor;
    }
    //me retorne o modelo
    public String getModelo() {
        return modelo;
    }
    //pode alterar o valor
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

  //capacidade do tanque set pode alterar
    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }
    public double totalvalortanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }
}
