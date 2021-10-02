/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducao;

import javax.swing.JOptionPane;
public class Ex14 {
    public static void main(String aargs[]){
    Double sal_m,sal_b,horas,val_h,impos;
    
    horas = Double.parseDouble(JOptionPane.showInputDialog("informe o número de horas trabalhadas"));
    sal_m = Double.parseDouble(JOptionPane.showInputDialog("informe o salário mínimo"));
    
    val_h = sal_m/2;
    sal_b = horas * val_h;
    impos = sal_b * 0.03;
    
    JOptionPane.showMessageDialog(null,"o salário final é: R$"+(sal_b-impos));//calcula o salário final na hora de mostrar
    }
}
