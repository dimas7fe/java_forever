package Aula2002;
import javax.swing.JOptionPane;
public class Exercicio3 {
    public static void main(String[] args) {
     double valor, conv,a;
     
     a = Double.parseDouble(JOptionPane.showInputDialog(": 1 - A conversão de centímetros para metros;\n" +
"e 2 - A conversão de metros para centímetros"));
     
     if(a == 1){
         valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
         conv = valor/100;
        
     }else{
         valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
       conv = valor*100;
     }
     JOptionPane.showMessageDialog(null,"O resultado da conversão é: " + conv);
    }
}
