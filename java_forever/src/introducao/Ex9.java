/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducao;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Ex9 {
    public static void main(String args[]){
        Double sal,ch1,ch2,saf;
        DecimalFormat decimalformat = new DecimalFormat("#,###.00");
        sal = Double.parseDouble(JOptionPane.showInputDialog("informe o salário"));
        ch1 = Double.parseDouble(JOptionPane.showInputDialog("informe o valor do 1° cheque"));
        ch2 = Double.parseDouble(JOptionPane.showInputDialog("informe o valor do 2° cheque"));
        saf = sal - ((ch1*0.0038+ch1)+(ch2*0.0038+ch2));//ja faz a conta da taxa de 0.38% descontando os cheques
        
        JOptionPane.showMessageDialog(null,"o saldo final é R$ "+ decimalformat.format(saf));
    }
}

