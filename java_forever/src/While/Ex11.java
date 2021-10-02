
package While;

import javax.swing.JOptionPane;
public class Ex11 {
    public static void main(String args[]){
        int cart=1, n_mul=0,mais_mult=0,mais_mult_cart=0;
        double val_mult=0,val_tt=0,div_mot=0;
        String resp="";
        while(cart!=0){
            cart = Integer.parseInt(JOptionPane.showInputDialog("informe a carteira do motorista"));
            if((cart >=1)&&(cart <=4327)){
                n_mul =Integer.parseInt(JOptionPane.showInputDialog("informe o número de multas"));
                if(n_mul > mais_mult){
                mais_mult_cart = cart;
                }
                for(int cont = 1; cont <=n_mul; cont++){
                    val_mult= Double.parseDouble(JOptionPane.showInputDialog("informe o valor da multa " + cont));
                    div_mot += val_mult;
                }
                val_tt += div_mot;
                
                resp += "carteira do moterista: "+cart+"\ndívida: R$"+div_mot+"\n";
                div_mot =0;
                
                
           }
            else{
                if(cart !=0){
                    JOptionPane.showMessageDialog(null,"carteira inválida");
                }
            }
        }
        JOptionPane.showMessageDialog(null, resp+"carteira com o maior número de multas: "+mais_mult_cart+" \nvalor total arrecadado: R$"+val_tt);
    }
}
