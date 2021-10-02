
package While;
import javax.swing.JOptionPane;
public class Ex03 {
    public static void main(String args[]){
    String letra="";
    while(!letra.equalsIgnoreCase("s")){
         letra = JOptionPane.showInputDialog("informe a letra");
    }
    
    }//fecha main
}
