package Aula2002;

import javax.swing.JOptionPane;

public class Exercicio6 {

    public static void main(String[] args) {
         double n,n2,r;
          n = Double.parseDouble(JOptionPane.showInputDialog("Informe um numeros  "));
          n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe um numeros  "));
          
          if(n == n2){
          r = n + n2;
          }else{
          if(n > n2){
          r = n - n2;
          }else{
          r = n2 - n;
          }
          }
           JOptionPane.showMessageDialog(null,"O resultado é: " + r);
                  
    }
}
