/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else;
import javax.swing.JOptionPane;
public class Ex08 {
    public static void main (String args[]){
      double idad;
      String cate,nome;
      
      nome = JOptionPane.showInputDialog("informe o nome");
      idad = Double.parseDouble(JOptionPane.showInputDialog("informe a idade"));
      cate = " ";
      if(idad >5){
         if((idad >= 5)&&(idad <=7)){
             cate = "Infantil A";
          
         }
         else{
            if((idad>=8)&& (idad <=11)){
                cate = "Infantil B";
            }
            else{
               if((idad >=12) &&(idad <=13)){
                   cate = "Juvenil A";
               
               }
               else{
                  if((idad >= 14)&&(idad <=17)){
                      cate = "Juvenil B";
                  }
                  else{
                     cate = "Adulto";
                  }
               }
            }
         }
      }
      else{
        System.exit(0);
      }
      JOptionPane.showMessageDialog(null,"o nadador "+ nome +"\n de idade  "+idad+" anos"+"\nesta na categoria "+cate);
      
    }//fecha main
}//fecha class
