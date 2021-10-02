/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticao_for;
import javax.swing.JOptionPane;
public class Ex06 {
    public static void main(String args[]){
       String letra="";
       int qtda=0,qtde=0,qtdi=0,qtdo=0,qtdu=0;
       for(int cont =1;cont <=20;cont++){
         letra =  JOptionPane.showInputDialog("informe as letras");
           if(letra.equalsIgnoreCase("a")){
               qtda++;    
           }
           else{
              if(letra.equalsIgnoreCase("e")){
               qtde++;    
              }
              else{
                if(letra.equalsIgnoreCase("i")){
                qtdi++;    
                }
                else{
                  if(letra.equalsIgnoreCase("o")){
                  qtdo++;    
                  }
                  else{
                    if(letra.equalsIgnoreCase("u")){
                    qtdu++;    
                    }
                  }
                }
              }
           }
           
       }//fecha for
       int consoant;
       consoant = 20 -(qtda+ qtde+qtdi+qtdo+qtdu);
       JOptionPane.showMessageDialog(null,"quantidade de A: "+qtda+
               "\nquantidade de E: "+qtde+
               "\nquantidade de I: "+qtdi+
               "\nquantidade de O: "+qtdo+
               "\nquantidade de U: "+qtdu+
               "\nquantidade de consoantes: "+consoant);
    }//fecha main
}//fecha class
