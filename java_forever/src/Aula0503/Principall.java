/*
 * na classe principal, sempre iremos criar os nossos objetos / instancias
 */
package Aula0503;
import javax.swing.JOptionPane;
public class Principall {
  // vamos criar o metodo principal 
    public static void main(String[] args) {
     // vamos criar um objeto
     
     Conta conta1 = new Conta();
     //conta1.saldo = 1000;
     //conta1.especial=500;
     //criando segunda conta
     conta1.saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite saldo da conta 1"));
     conta1.especial = Double.parseDouble(JOptionPane.showInputDialog("Digite especial da conta 1"));
     
     
     Conta conta2 = new Conta();
     //conta2.saldo = 2000;
     //conta2.especial = 1000;
     conta2.saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite saldo da conta 2"));
     conta2.especial = Double.parseDouble(JOptionPane.showInputDialog("Digite especial da conta 2"));
     
        System.out.println("Conta 1:");
     conta1.mostrarValores();
        System.out.println("Conta 2:");
     conta2.mostrarValores();
     
        
        conta1.saque(2000);
        //verificando novo valor
        System.out.println("Saldo após saque conta1: " + conta1.saldo);
        
        
       
    }    
}
