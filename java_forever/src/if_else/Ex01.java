/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else;
                                           //exercicio estruturas de decisão
import javax.swing.JOptionPane;
public class Ex01 {
    public static void main(String args[]){
      Double n1, n2, media;  
    
      n1 = Double.parseDouble(JOptionPane.showInputDialog("informe a nota 1"));
      n2 = Double.parseDouble(JOptionPane.showInputDialog("informe a nota 2"));
      
      media = (n1+n2)/2;
      
      if(media >=7){
          JOptionPane.showMessageDialog(null, "aluno aprovado");
      }
      else{
          if((media >=4) && (media <7)){
             JOptionPane.showMessageDialog(null, "aluno de recuperação");
          }
          else{
              JOptionPane.showMessageDialog(null, "aluno reprovado");
          }
      }                                                            
      
    }//fecha main
}//fecha classe
