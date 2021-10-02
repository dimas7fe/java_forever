/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducao;

import javax.swing.JOptionPane;
public class Ex15 {
    public static void main (String args[]){
    Double sal_m,watts,val_w,val_t;
    sal_m = Double.parseDouble(JOptionPane.showInputDialog("informe o salário mínimo"));
    watts = Double.parseDouble(JOptionPane.showInputDialog("informe o número de quilowatts gastos"));
    val_w = sal_m / 5;
    val_t = watts * val_w;
    JOptionPane.showMessageDialog(null,"o valor de cada qulowatt é: R$"+val_w+
            "\no valor total a ser pago pela residência é: R$"+val_t+
            "\no valor total a ser pago com desconto é: R$"+ (val_t-(val_t*0.15)));
    }
}
