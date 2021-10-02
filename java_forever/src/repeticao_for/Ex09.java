/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticao_for;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Ex09 {
    public static void main(String args[]){
        DecimalFormat formatando = new DecimalFormat("#,###.##");
        int ano;
        double sal=1000,aum=1.5;
        
        sal += sal*(aum/100);
        
        ano = Integer.parseInt(JOptionPane.showInputDialog("informe o ano"));
        for(int cont = 2015; cont <=ano;cont++){
        aum = aum*2;
        sal += sal*(aum/100);
        }
        JOptionPane.showMessageDialog(null,"o novo salário é: "+ formatando.format(sal));
    }
}
