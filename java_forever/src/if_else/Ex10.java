/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else;

import javax.swing.JOptionPane;
public class Ex10 {
   public static void main(String args []){
   String nome,tp_ap;
   double val_d=0,num_d,val_cons,diaria =0,tx_ser;
   
   nome = JOptionPane.showInputDialog("informe o seu nome");
   tp_ap = JOptionPane.showInputDialog("informe o tipo de quarto");
   num_d = Double.parseDouble(JOptionPane.showInputDialog("informe o número de diárias"));
   val_cons = Double.parseDouble(JOptionPane.showInputDialog("informe o consumo interno"));

   if(tp_ap.equalsIgnoreCase("a")){
      diaria = 150;
      val_d = num_d * 150;
   }
   else{
       if(tp_ap.equalsIgnoreCase("b")){
          diaria = 100;
          val_d = num_d * 100;
       }
       else{
           if(tp_ap.equalsIgnoreCase("c")){
              diaria = 75;
              val_d = num_d * 75;
           }
           else{
               if(tp_ap.equalsIgnoreCase("d")){
                  diaria = 50;
                  val_d = num_d *50;
               }
           }
       }
   }
   tx_ser = (val_d + val_cons)*0.09;
   JOptionPane.showMessageDialog(null, "cliente: "+nome+
           "\ntipo de apartamento: "+tp_ap.toUpperCase()+//toUpperCase passa pra maiusculo
           "\nnúmero de diárias; "+num_d+
           "\nvalor unitário da diaria: R$" +diaria+
           "\nvalor da diária: R$"+val_d+
           "\nvalor do consumo interno: R$"+val_cons+
           "\nsubtotal: R$"+(val_d+val_cons)+
           "\ntaxa de serviço: R$"+tx_ser+
           "\ntotal geral: R$"+(val_d + val_cons+tx_ser)
           );
   
   } 
}
