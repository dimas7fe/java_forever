/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducao;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Ex8 {
    public static void main (String args []){
    Double salm,salf;
    DecimalFormat decimalformat =  new DecimalFormat("#,###.00");
    salm = Double.parseDouble(JOptionPane.showInputDialog("informe o salário mínimo"));
    salf = Double.parseDouble(JOptionPane.showInputDialog("informe o salário do funcionário"));
    JOptionPane.showMessageDialog(null,"o funcioário ganha "+ decimalformat.format((salf/salm))+" salários minimos");
    }
}
