package Aula2002;

import javax.swing.JOptionPane;

public class Exercicio9 {

    public static void main(String[] args) {
        double ht, vh, salb, sall, inss, imp=0, valini, ali;

        ht = Double.parseDouble(JOptionPane.showInputDialog("Informe a hora trabalhada"));
        vh = Double.parseDouble(JOptionPane.showInputDialog("Informe  o valor de horas trabalhada"));

        salb = ht * vh;
        inss = salb * 0.11;
        valini = salb - inss;
        if ((valini >= 1257.13) && (valini <= 2512.08)) {
            imp = valini * 0.15 - 188.57;
            
        } else {
            if (valini >= 2512.08) {
                imp = valini * 0.275 - 502.58;
               
            }
        }
   
        sall = valini - imp ;
        JOptionPane.showMessageDialog(null,"O salario liquido e " + sall);
    }
}
