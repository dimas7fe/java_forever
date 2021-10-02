/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducao;

import javax.swing.JOptionPane;
        
public class Ex03 {
    public static void main(String args[]){
           double n1,n2,n3,p1,p2,p3,me;
           
           n1 = Double.parseDouble(JOptionPane.showInputDialog("informe a nota 1º"));
           n2 = Double.parseDouble(JOptionPane.showInputDialog("informe a nota 2º"));
           n3 = Double.parseDouble(JOptionPane.showInputDialog("informe a nota 3º"));
           p1 = Double.parseDouble(JOptionPane.showInputDialog("informe o peso da nota 1"));//pesos inteiros
           p2 = Double.parseDouble(JOptionPane.showInputDialog("informe o peso da nota 2"));
           p3 = Double.parseDouble(JOptionPane.showInputDialog("informe o peso da nota 3"));
           
           me = (n1*(p1/10)+(n2*(p2/10))+(n3*(p3/10)));
           
           JOptionPane.showMessageDialog(null,"a média é " + me);
    }//fechamain
}//fechaclasse
