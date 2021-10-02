/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else;

import javax.swing.JOptionPane;
public class Ex06 {
    public static void main(String args[]){
        int n1,n2,n3,n4;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("informe 3 números em ordem crescente\n1º numnero:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("2º número:"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("3º número:"));
        n4 = Integer.parseInt(JOptionPane.showInputDialog("4º número aleatório"));
        
        if((n1<n2)&&(n2<n3)){
           if(n4<n1){
               JOptionPane.showMessageDialog(null,"a ordem é "+n3+" "+n2+" "+n1+" "+n4);
           
           }
           else{
              if((n4>n1)&&(n4<n2)){
               JOptionPane.showMessageDialog(null,"a ordem é "+n3+" "+n2+" "+n4+" "+n1);
           
              }
               if((n4>n2)&&(n4<n3)){
               JOptionPane.showMessageDialog(null,"a ordem é "+n3+" "+n4+" "+n2+" "+n1);
           
               }
               else{
                 JOptionPane.showMessageDialog(null,"a ordem é "+n4+" "+n3+" "+n2+" "+n1);
               }
           }
        }
        else{
          JOptionPane.showMessageDialog(null,"inválido");
          System.exit(0);//mata o sistema
        }
    }//fecha main
}//fecha classe
