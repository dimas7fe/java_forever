/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducao;

import javax.swing.JOptionPane;
public class Ex13 {
    public static void main (String args[]){
    Double pre_f,lucro,impos;
    
    pre_f = Double.parseDouble(JOptionPane.showInputDialog("informe o preço de fabrica"));
    lucro = Double.parseDouble(JOptionPane.showInputDialog("informe a porcentagem de lucro"));
    impos = Double.parseDouble(JOptionPane.showInputDialog("informe a porcentagem de imposto"));
    
    lucro = (lucro/100)*pre_f;      //o valor do imposto e do lucro ja é calculado e sobreescreve o dado inicial
    impos = (impos/100) * pre_f;
    
    JOptionPane.showMessageDialog(null,"o valor final do carro é: R$" + (pre_f+lucro+impos)+//calcula o valor final
                                  "\no lucro do distribuidor é: R$"+lucro+
                                  "\no valor do imposto é: R$"+impos);

}
}
