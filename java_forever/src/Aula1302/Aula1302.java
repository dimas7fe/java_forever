package Aula1302;

import javax.swing.JOptionPane;

public class Aula1302 {

    public static void main(String[] args) {
        double vimp, perc, vtrans, vvenal;
 vimp = 0;
        vtrans = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da transação"));
        vvenal = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor vanal"));
        perc = Double.parseDouble(JOptionPane.showInputDialog("Informe o percentual de imposto"));

        if (vtrans > vvenal) {

            vimp = vtrans * perc / 100 + vtrans;

        } else {
            if (vvenal > vtrans) {
                vimp = vvenal * perc / 100 + vvenal;
            }
        }
        
        JOptionPane.showMessageDialog(null,"O final a ser pago é: " +  vimp + "o importo digitado foi: "+ perc);
    }

}
