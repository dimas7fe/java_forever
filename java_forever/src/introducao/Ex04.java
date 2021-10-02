/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducao;
  import javax.swing.JOptionPane;
public class Ex04 {//salario
    public static void main(String args[]){
    double sal,slf,aum; //slf = sal final
    sal = Double.parseDouble(JOptionPane.showInputDialog("informe o salário"));
    aum = Double.parseDouble(JOptionPane.showInputDialog("informe o aumento em %"));
    
    slf = (sal + sal*(aum/100));
            
    JOptionPane.showMessageDialog(null,"o salário é " + slf);
    }
}
