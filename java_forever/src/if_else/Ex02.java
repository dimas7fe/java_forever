/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else;

import javax.swing.JOptionPane;
public class Ex02 {
  public static void main(String args[]){
    String letr;
    letr = JOptionPane.showInputDialog("informe uma letra");
    if((letr.equalsIgnoreCase("a"))||
            (letr.equalsIgnoreCase("e"))||
            (letr.equalsIgnoreCase("i"))||
            (letr.equalsIgnoreCase("o"))||
            (letr.equalsIgnoreCase("u"))){
        JOptionPane.showMessageDialog(null,"é uma vogal");
    }
    else{
        JOptionPane.showMessageDialog(null,"é uma consoante");
    }
    
  }//fecha main  
}//fecha classe
