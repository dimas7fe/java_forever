
package repeticao_for;
import javax.swing.JOptionPane;
public class Ex04 {
   public static void main(String args[]){
       int num,ma=0;
       for (int cont =0; cont<10;cont++){
       num = Integer.parseInt(JOptionPane.showInputDialog("informe os números"));
       if(num > ma){
          ma = num;
       }
       
       }
       JOptionPane.showMessageDialog(null, "o maior número é "+ma);
   } 
}
