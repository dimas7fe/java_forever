/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else;

import javax.swing.JOptionPane;
public class Ex09 {
    public static void main (String args[]){
         int opc;
         double sal, aum=0;
         String car;
         
         opc = Integer.parseInt(JOptionPane.showInputDialog("informe o cargo \n1- Escrituario \n2-Secretario \n3-caixa \n4-Gerente \n5-diretor"));
         sal = Double.parseDouble(JOptionPane.showInputDialog("informe o salário"));
         car = " ";
         if(opc==1){
           car = "Escrituario";
           aum = sal*0.5;
           sal = sal*1.5;
           
         }
         else{
            if(opc==2){
              car = "Secretário";
              aum = sal*0.35;
              sal = sal*1.35;
             
            }
            else{
              if(opc==3){
                 car = "Caixa";
                 aum = sal*0.2;
                 sal = sal*1.2;
                 
              }
              else{
                if(opc ==4){
                   car = "Gerente";
                   aum = sal*0.1;
                   sal = sal*1.1;
                   
                }
                else{
                  if(opc==5){
                    car = "Diretor";
                    aum = 0;
                  }
                }
              }
            }
         }
         JOptionPane.showMessageDialog(null, "o cargo de " +car+" tem aumento de R$" +aum+"\n seu novo salário é de R$"+sal);
         
    }//fecha main
}//fecha class
