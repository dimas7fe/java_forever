package Aula1302;

import javax.swing.JOptionPane;

public class aula1302p2 {

    public static void main(String[] args) {
        double n1, n2, med, trab;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2"));
        trab = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota do trabalho"));

        med = (n1 + n2 + trab)/3;
        
        if((med >= 6) && (med <=10)){
        JOptionPane.showMessageDialog(null, "Aprovado.");
        }
        else{
        JOptionPane.showMessageDialog(null, "Reprovado.");
        }
    }
}
