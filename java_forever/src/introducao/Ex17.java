/*Sabe-se que para iluminar de maneira correta os cômodos de uma casa, para 
cada metro quadrado, deve-se usar 18 w de potência.  Faça um programa que receba
as duas dimenções de um comodo (em metros), calcule e mostre a sua área (em metros quadrados)
e a potência de iluminação que deverá ser utilizada
 */
package introducao;
import javax.swing.JOptionPane;
public class Ex17 {
    public static void main(String args[]){
    Double larg,comp;
    
    larg = Double.parseDouble(JOptionPane.showInputDialog("informe a largura do cômodo (m)"));
    comp = Double.parseDouble(JOptionPane.showInputDialog("informe o comprimento do cômodo (m)"));
    
    JOptionPane.showMessageDialog(null,"deveram ser usado "+ ((larg*comp)*18)+ " Watts de potência");
    
    }
}