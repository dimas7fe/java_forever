
package While;

import javax.swing.JOptionPane;
public class Ex09 {
    public static void main(String args[]){
    int num=1,cont=0;
    String fim="";
    while (num!=0){
        num = Integer.parseInt(JOptionPane.showInputDialog("informe o número"));
        fim="";
        if(num!=0){
            cont = 0;
            while(cont<=10){
                fim += ( num+" X "+ cont +" = " +(num*cont)+"\n");
                cont++;
            }   
        }
        JOptionPane.showMessageDialog(null,fim);
    
    }
    
    }
}
