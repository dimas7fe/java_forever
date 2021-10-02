
package repeticao_for;

import javax.swing.JOptionPane;
public class eX03 {
   public static void main(String args[]){
      int n=0,s=0;
      n= Integer.parseInt(JOptionPane.showInputDialog("informe o número de números"));
      for(int cont =0;cont <=n;cont++){
      s +=cont;
      }
      JOptionPane.showMessageDialog(null, "a soma é " + s);
   } 
}
