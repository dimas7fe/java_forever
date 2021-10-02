
package While;
/*
faca um progama que receba o salário de um funcionário chamado josé
Sabe-se que o funcionário mario tem um salário equivalente a um terço
do salário de josé.
josé aplicará seu salario integralmente na caderneta de poupança, que 
está rendendo 2% ao mês e Mario aplicará seu salário integralmente no fundo
de renda fixa, que está rendendo 5% ao mês.
Calcule e mostre a quantidade de meses necessários para que o valor pertencente
a mario iguale ou ultrapasse o valor pertencente a José.
*/
import javax.swing.JOptionPane;
public class Ex08 {
    public static void main(String args[]){
    double sal_jos,sal_mar;
    int meses=0;
        
        sal_jos = 1000;
        sal_mar = sal_jos/3;
               
        while(sal_jos>sal_mar){
            
            sal_mar += sal_mar*0.05;
            sal_jos += sal_jos*0.02;
            
            meses++;
            
        }
        
        JOptionPane.showMessageDialog(null,
            "O número de meses é de: "+meses);
        
        
        
    }//fecha main
}
