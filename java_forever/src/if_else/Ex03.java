
package if_else;
import javax.swing.JOptionPane;
public class Ex03 {
    public static void main(String args[]){
      int agua;
      String tp;
      agua = Integer.parseInt(JOptionPane.showInputDialog("informe a quantidade de pontos d'água "));
      
      if(agua <= 10){
         tp = "a terra é rochosa";
      }
      else{
           if((agua >10) &&(agua <=40)){
              tp = "a terra é firme";
           }
           else{
                if(agua > 40 && agua <= 80){
                   tp = "a terra é pantanosa";
                }
                else{
                    tp = "quantidade de água inválida";
                }
           }
      }
      
      JOptionPane.showMessageDialog(null,tp);
      
    }//fecha main
}//fecha class
