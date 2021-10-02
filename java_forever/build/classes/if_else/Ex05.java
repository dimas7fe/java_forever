/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else;

import javax.swing.JOptionPane;
public class Ex05 {
    public static void main(String args[]){
       int op,n1,n2,n3;
       
       op = Integer.parseInt(JOptionPane.showInputDialog("1- somar dois números inteiros \n2- multiplicar três números inteiros\nDigite a opção:"));
       if((op==1)||(op==2)){
          n1 = Integer.parseInt(JOptionPane.showInputDialog("informe o 1º número"));
          n2 = Integer.parseInt(JOptionPane.showInputDialog("informe o 2º número"));
          if(op==1){
             JOptionPane.showMessageDialog(null," a soma é "+ (n1+n2));
          }
          else{
             if(op==2){
              n3 = Integer.parseInt(JOptionPane.showInputDialog("informe o 3º número"));
              JOptionPane.showMessageDialog(null,"a multiplicação dos três termos é "+ (n1*n2*n3));
             }
          }
       }
       else{
               JOptionPane.showMessageDialog(null,"opção inválida");
               System.exit(0);//mata o sistema
       }
    }//fecha main
}//fecha classe
