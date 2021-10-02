/*
 *Apresentar a soma de todos os valores númericos inteiros i´pares situados na faixa de 100 a 200
 */
package repeticao_for;
import javax.swing.JOptionPane;
public class Ex07 {
   public static void main (String args[]){
     int soma=0;
     
     for(int cont=100; cont<=200; cont++){
        if(cont %2 == 1){
          soma +=cont;
        }
     }
     JOptionPane.showMessageDialog(null,"a soma é "+soma);
   } 
}
