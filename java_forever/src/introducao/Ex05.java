/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducao;

import javax.swing.JOptionPane;

public class Ex05 {
    public static void main(String args[]){
    
    double pre;
    
    pre = Double.parseDouble(JOptionPane.showInputDialog("informe o preço"));
    
    JOptionPane.showMessageDialog(null, "o preço é " + (pre-(pre*0.1)));
    }
    
}
