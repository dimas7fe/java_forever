package Aula2002;
import javax.swing.JOptionPane;
public class Exercicio4 {
    public static void main(String[] args) {
    double preco, ali, f;
    preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto"));
    ali = Double.parseDouble(JOptionPane.showInputDialog("Informe a aliquota"));
    
   f =   preco - (preco * (ali/100));
   
   JOptionPane.showMessageDialog(null,"O preço final é: " + f);

    }
}
