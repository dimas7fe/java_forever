package Aula1302;

import javax.swing.JOptionPane;

public class aula1302p3 {

    public static void main(String[] args) {
        int idade, qtd_contri, fcontr;
        String sexo;

        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade"));
        qtd_contri = Integer.parseInt(JOptionPane.showInputDialog("Informe quantidade de contribuição"));
        sexo = (JOptionPane.showInputDialog("Informe o sexo"));
        
        if (sexo.equalsIgnoreCase("m") && (qtd_contri <= 35) && (idade <= 65)) {
            fcontr = 35 - qtd_contri;
            JOptionPane.showMessageDialog(null, "Falta " + fcontr + " para se aposentar");
        } else {
            if (sexo.equalsIgnoreCase("f") && (qtd_contri <= 30) && (idade <= 60)) {
               fcontr = 30 - qtd_contri;
               JOptionPane.showMessageDialog(null, "Falta " + fcontr + " para se aposentar");
            }

        }

    }
}
