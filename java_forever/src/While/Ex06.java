
package While;
import javax.swing.JOptionPane;
public class Ex06 {
   public static void main(String args[]){
   double num=0,n1=0,n2=0,n3=0,n4=0,n5=0;
   while(num >=0){
       num = Double.parseDouble(JOptionPane.showInputDialog("informe o número"));
        if((num >=0)&&(num<=25)){
            n1++;
        }
        else{
            if((num>=26)&&(num<=50)){
               n2++;
            }
             else{
                if((num>=51)&&(num<=75)){
                    n3++;
                }
                else{
                    if((num>=76)&&(num<=100)){
                        n4++;
                    }
                    else{
                        if(num>=101){
                            n5++;
                        }
                   }
               }
           }
       }  
   }
   JOptionPane.showMessageDialog(null,
            "números entre 0-25: "+n1+
            "\nnúmeros entre 26-50: "+n2+
            "\nnúmeros entre 51-75: "+n3+
            "\nnúmeros entre 76-100: "+n4+
            "\nnúmeros maiores que 100: "+n5);
   
   } 
}
