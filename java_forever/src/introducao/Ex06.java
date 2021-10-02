/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducao;

import javax.swing.JOptionPane;
public class Ex06 {
    public static void main(String args[]){
    
    Double sal,com,saf;    
    
    sal = Double.parseDouble(JOptionPane.showInputDialog("informe o salário "));
    com = Double.parseDouble(JOptionPane.showInputDialog("informe as vendas"));
    saf = (sal+(com*0.04));
    
    JOptionPane.showMessageDialog(null,"o salário final é " + saf + "\na comissão é " + (com*0.04));
    } 
}
