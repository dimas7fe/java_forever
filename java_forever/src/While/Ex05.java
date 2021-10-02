
package While;
import javax.swing.JOptionPane;
public class Ex05 {
    public static void main(String args[]){
    int ma=0,me=0,num=1;
    Boolean p=true;
    while(num !=0){
     num = Integer.parseInt(JOptionPane.showInputDialog("informe o número"));
     
     if(p){
     ma = num;
     me = num;
     p=false;
     }
     else{
         if(ma <num){
            ma = num;
         }
          if((me > num)&& (num !=0)){
              me = num;
          }
     }
    }
    JOptionPane.showMessageDialog(null,"maio número: "+ma+"\nmenor número: "+me );
    }//fecha main
}
