/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducao;

import javax.swing.JOptionPane;
public class Ex2 {
    public static void main(String args[]){
        Double n1,n2;
    n1 = Double.parseDouble(JOptionPane.showInputDialog("informe a 1° nota"));
    n2 = Double.parseDouble(JOptionPane.showInputDialog("informe a 2° nota"));
    
    JOptionPane.showMessageDialog(null,"a média é " + (n1+n2)/2);
    }
}
