/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticao_for;

import javax.swing.JOptionPane;
public class Ex08 {
    public static void main (String args[]){
      int m2=0;
      double alt,med=0;
      for(int cont = 1;cont <=20; cont++){
         alt = Double.parseDouble(JOptionPane.showInputDialog("informe a altura"));
         med += alt;//dps dividi por 20
         if(alt >2){
         m2++;
         }
      }
      JOptionPane.showMessageDialog(null,"a media das alturas: "+ (med/20)+
              "o número de pessoas com mais de 2m é: "+m2);
    }
}
