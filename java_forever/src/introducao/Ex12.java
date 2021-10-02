/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducao;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Ex12 {
    public static void main(String ags[]){
    Double pes,jard,pole,milh;
    DecimalFormat decimalformat = new DecimalFormat("#,###.###");
    pes = Double.parseDouble(JOptionPane.showInputDialog("informe a medida em pés"));
    
    pole = pes * 12;
    jard = pes /3;
    milh = jard/1760;
    
    JOptionPane.showMessageDialog(null,"as medidas convertidas são: "+
            "\n pés:" +pes+
            "\n jardas: "+decimalformat.format(jard)+
            "\n polegadas: "+decimalformat.format(pole)+
            " \n milhas: "+ decimalformat.format(milh));
    }
}
