/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducao;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Ex10 {
    public static void main(String args[]){
    Double nas,hoj,ida;
    DecimalFormat decimalformat = new DecimalFormat("#,###");
    nas = Double.parseDouble(JOptionPane.showInputDialog("informe o ano de nascimento"));
    hoj = Double.parseDouble(JOptionPane.showInputDialog("informe o ano atual"));
    
    ida = (hoj - nas);
    
    JOptionPane.showMessageDialog(null,"a idade é: \nem anos: "+decimalformat.format(ida)+
            "\nem messes: "+decimalformat.format(ida*12)+
            "\nem dias: "+decimalformat.format(ida*365)+
            "\nem semanas: "+decimalformat.format(ida*52));
    }
}
