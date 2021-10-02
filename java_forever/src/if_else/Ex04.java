/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else;

import javax.swing.JOptionPane;
public class Ex04 {
    public static void main(String args[]){
      double l1,l2,l3;
      String tp="";
      l1 = Double.parseDouble(JOptionPane.showInputDialog("informe o 1 lado"));
      l2 = Double.parseDouble(JOptionPane.showInputDialog("informe o 2 lado"));
      l3 = Double.parseDouble(JOptionPane.showInputDialog("informe o 3 lado"));
      if((l1 == l2) && (l1 == l3)){
         tp = "triângulo equilátero";
      }
      else{
           if((l1 != l2) && (l2!=l3)){
              tp = "triângulo escaleno";
           }
           else{
                tp = "triângulo isóceles";
           }
      }
        System.out.println(l1+ "   " + l2+ "    "+l3);
      JOptionPane.showMessageDialog(null,"é um "+ tp);
    }//fecha main
}//fecha class
