package Aula2002;
import javax.swing.JOptionPane;
public class Exercicio10 {
    public static void main(String[] args) {
    double n1,n2, med;
    
    n1= Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1"));
       n2= Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2"));
        
       med = n1/n2;
    
       if(med < 6) {
       JOptionPane.showMessageDialog(null,"Voce esta reprovado");
       }else{
        JOptionPane.showMessageDialog(null,"Voce esta aprovado");
       }
    }
}
