package Aula2002;

import javax.swing.JOptionPane;

public class Exercicio8 {

    public static void main(String[] args) {
      double c, qtd,pr,vf,vf1;
      
      c = Double.parseDouble(JOptionPane.showInputDialog("Informe o dinhero que tem no caixa"));
      qtd = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de produtos a ser comprada "));
      pr = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço de cada unidade "));
      
      vf = qtd * pr;
      
      if(vf > (0.8*c) ){    
      vf1 = vf * 1.1;
      JOptionPane.showMessageDialog(null,"A forma de pagamento foi a prazo e o valor total é: " + vf1);
      }else{
      vf1 =   vf -(vf *0.05);
      JOptionPane.showMessageDialog(null,"A forma de pagamento foi a vista e o valor total é: " + vf1);
      }
              
    }
}
