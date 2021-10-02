/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducao;
import javax.swing.JOptionPane;
public class Ex01 {
    public static void main(String args[]){
        String mensagem;
        double n1;
        int n2;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("informe o número 1"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("informe o numero 2"));
        mensagem = JOptionPane.showInputDialog("informe a mensagem");
        //System.out.println("o meu primeiro programa");
       // JOptionPane.showMessageDialog(null, "oi \nmeu primeito programa");
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    }

