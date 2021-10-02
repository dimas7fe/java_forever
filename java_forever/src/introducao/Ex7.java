/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducao;

import javax.swing.JOptionPane;
public class Ex7 {
    public static void main(String args[]){
    
    double bame,bama,altu;
    bame = Double.parseDouble(JOptionPane.showInputDialog("informe a base menor do trapézio"));
    bama = Double.parseDouble(JOptionPane.showInputDialog("informe a base maior do trapézio"));
    altu = Double.parseDouble(JOptionPane.showInputDialog("informe a altura do trapézio"));
    
    JOptionPane.showMessageDialog(null,"a área do trapézio é " + ((bama + bame)*altu)/2);
    }
   }
