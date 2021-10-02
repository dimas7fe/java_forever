package Aula0503;

import javax.swing.JOptionPane;

public class Conta {

    //uma unica variavel global
    //esta fora do metodo
    //caracteristicas das classes
    double saldo;

    
    //novo atributo para definir
    //o valor do cheque especial 
    double especial;
    
    
    //vamos definir o comportamento deste objeto 
    //definimismos o comportamento de uma classe
    // por meio de metodo()
    public void deposito(double valor) {
        //somamos quantidade da varialvel valor
        //a variavel saldo
        saldo = saldo + valor;
    }

    public void saque(double valor) {
        
        saldo = especial + saldo;
        
         if(valor<=saldo){
        saldo = saldo - valor;
         }else{
             System.out.println("Não é possivel valor maior que o saldo");
         }
    }
    
    public void mostrarValores(){
        System.out.println("Saldo: " + saldo + "\nEspecial: " + especial);
    }
    
    
    
    //vamos subtrair um valor
    //da nossa primeira conta
    
}
