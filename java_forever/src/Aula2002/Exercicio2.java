package Aula2002;

import javax.swing.JOptionPane;

public class Exercicio2 {

    public static void main(String[] args) {
            int n, resto, suc, ant;
            n = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero inteiro"));
            
            resto = n % 2; 
            if(resto == 0){
            
            suc = n + 1;
            ant = n - 1;
            JOptionPane.showMessageDialog(null,"O numero é par e o antecessor é: " + ant + " e o sucessor é: " + suc);
            }else{
              suc = n + 1;
            ant = n - 1;
            JOptionPane.showMessageDialog(null,"O numero é impar e o antecessor é: " + ant + " e o sucessor é: " + suc);
            }
    }
}
