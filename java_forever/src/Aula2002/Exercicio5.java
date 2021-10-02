package Aula2002;

import javax.swing.JOptionPane;

public class Exercicio5 {

    public static void main(String[] args) {
     double vm;
     String nome;
     
     vm = Double.parseDouble(JOptionPane.showInputDialog("Informe o valores de vendas"));
     nome = (JOptionPane.showInputDialog("Informe o nome"));
     
     if((vm > 10000) && (vm < 50000)){
      JOptionPane.showMessageDialog(null,"O nome dele é: " + nome);
     }else{
     JOptionPane.showMessageDialog(null,"Voce ainda nao acumulou 10 mil a 50 mil");
     }
    }
}
