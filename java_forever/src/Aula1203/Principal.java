/*
VAMOS CRIAR UM CARRO.
ONIX DA CHEVROLET NA COR BRANCA
INICIALMENTE NA VELOCIDADE IGUAL A ZERO E ESTADO DELISGADO
*/
package Aula1203;
import javax.swing.JOptionPane;
//METODO PRINCIPAL
public class Principal {
    public static void main(String[] args) {
        // criar o objeto carro1
        Carro carro1 = new Carro();
        carro1.criarCarro(
        JOptionPane.showInputDialog("Digite a marca de carro"),
        JOptionPane.showInputDialog("Digite o modelo do carro"),
        JOptionPane.showInputDialog("Dgite a cor do carro")
        );
        
        carro1.mostrarDados();    
    
    carro1.acelerar();
    
    
       carro1.mostrarDados();  
    }
}
