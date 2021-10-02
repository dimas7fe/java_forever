/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excecao;

import javax.swing.JOptionPane;
public class excecao_exemplo {
    public static void main (String args[]){
        int numero;
        String tabuada="";
        try{
        numero = Integer.parseInt(JOptionPane.showInputDialog("informe o número"));
        for(int cont=0; cont<=10;cont++){
            tabuada += numero + "X" + cont + " = "+numero*cont + "\n"; 
        }
        JOptionPane.showMessageDialog(null, tabuada);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"você tentou digitar uma letra onde deveria ser somente um número inteiro"+
                                                e.getMessage());
        }
        finally{
            JOptionPane.showMessageDialog(null,"fim do sistema");
        }
    }
}
