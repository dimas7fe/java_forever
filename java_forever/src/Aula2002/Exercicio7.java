package Aula2002;

import javax.swing.JOptionPane;

public class Exercicio7 {

    public static void main(String[] args) {
    String cl;
       cl = (JOptionPane.showInputDialog("Informe o codigo do livro"));
    
       if(cl.equalsIgnoreCase("a")){
       JOptionPane.showMessageDialog(null,"O livro é de ficção");
       }else{
       if(cl.equalsIgnoreCase("b")){
        JOptionPane.showMessageDialog(null,"O livro é de não-ficção");
       }else{
        JOptionPane.showMessageDialog(null,"O codigo do livro é invalido");
       }
       }
    }
}
