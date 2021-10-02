/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticao_for;

import javax.swing.JOptionPane;
public class Ex05 {
   public static void main (String args[]){
      int n,ma = 0,me = 0;
      Boolean p = true;
      for(int cont=1; cont <=10;cont++){
          n = Integer.parseInt(JOptionPane.showInputDialog("O número"));
          if(p==true){
            me = n;
            p  = false;
          }
          if(n > ma ){
             ma = n;
          }
          if(n < me){
          me = n;
          }
          
      }//fecha for
      JOptionPane.showMessageDialog(null,"o maior número é: "+ma +"\no menor número é: " + me);
      
   }//fecha main 
}//fecha classs
