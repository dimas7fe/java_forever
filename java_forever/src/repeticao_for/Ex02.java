
package repeticao_for;

import javax.swing.JOptionPane;
public class Ex02 {
   public static void main(String args[]){
   int num, soma=0;
   for(int cont = 1;cont<=10;cont++){
      num = Integer.parseInt(JOptionPane.showInputDialog("informe o número"));
      soma += num; // <-- soma = soma+num
   }
   JOptionPane.showMessageDialog(null, "a soma é "+soma);
   } 
}
