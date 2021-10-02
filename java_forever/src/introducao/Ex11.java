/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducao;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Ex11 {
    public static void main(String args[]){
    Double sal,imp;
    DecimalFormat decimalformat = new DecimalFormat("#,###.##");
    sal = Double.parseDouble(JOptionPane.showInputDialog("informe o salário base"));
    
    imp = sal*0.1;
    
    JOptionPane.showMessageDialog(null,"o salário final é " +decimalformat.format((sal-imp+50)));//ja calcula o salario final
    }
}
