package Aula2002;

import javax.swing.JOptionPane;

public class Exercicio1 {

    public static void main(String[] args) {
          double altura, pesoideal=0;
          String sexo;
          
        altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura"));
        sexo = (JOptionPane.showInputDialog("Informe o sexo"));
        
        if(sexo.equalsIgnoreCase("m")){
        pesoideal = 72.7 * altura;
        
        }else{
        pesoideal = (62.1 * altura) - 44.7 ;
        }
        JOptionPane.showMessageDialog(null, "Seu peso ideal é:" + pesoideal);
    }
}
