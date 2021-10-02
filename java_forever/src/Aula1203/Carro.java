/*
VAMOS CRIAR UMA CLASSE QUE SEJA CAPAZ DE GERENCIAR COMPORTAMENTO E DADOS DE UM CARRO. ENTÃO PRECISAMOS PENSAR NOS ATRIBUTOS QUE PODERIAM INDENTICAR UM CARRO.
ENTÃO PRECISAMOS PENSAR NOS ATRIBUTOS QUE PODERIAM INDENTIFICAR UM CARRO, E TAMBÉM O COMPORTAMENTO QUE O CARRO DEVERIA TER, ESPECIFCADO EM SEUS MÉTODOS.

ATRIBUTOS: MODELO, COR, MARCA, ESTADO (LIGADO/DESLIGADO)
VELOCIDADE

COMPORTAMENTO: LIGAR(); DESLIGAR (); ACELARAR(); FRETAR()
 */
package Aula1203;
//ESTRUTURA - MODELO - FRAMEWORK

public class Carro {

    //ATRIBUTOS /controlam os dados
    String modelo, cor, marca, estado;
    int velocidade;

    //comportamento / definimos os metodos 
// metodo ligar()
// ira modificar a variavel estado para 'ligado'
    public void ligar() {
        this.estado = "ligado";
    }

    //metodo desçogar()
    //modifica variavel estado para 'desligado'
    public void desligar() {
        this.estado = "desligado";
    }

    //metodo acelerar()
    // a cada vez que ele é chamado aumenta 
    // a velocidade em 10km/h
    public void acelerar() {
        if(estado.equalsIgnoreCase("ligado")){
        this.velocidade = this.velocidade + 10;
    }else{
    System.out.println("O carro se encontra desligado");
}
    }

    public void desacelerar() {
if(velocidade > 0){
        this.velocidade = this.velocidade - 10;
}
    }

    //o metodo frear ira levar a velocidade a zero
    public void frear() {
        this.velocidade = 0;
    }

    //metodo para criar o carro(modelo/cor/marca)
    public void criarCarro(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.estado = "ligado";
        this.velocidade = 0;
    }
   public void mostrarDados(){
   
        System.out.println("\nMarca: " + marca + "\nmodelo: " + modelo + "\ncor: " + cor + "\nEstado: " + estado + "\nVelocidade: " + velocidade);
  
   }
}
