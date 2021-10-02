/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamento_Ex03;
import javax.swing.JOptionPane;
public class MotoristaVIEW {
    public static void main(String args[]){
        try{
            MotoristaDTO motoristaDTO = new MotoristaDTO();
            MotoristaDAO motoristaDAO = new MotoristaDAO();
            
            motoristaDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade:")));
            
            JOptionPane.showMessageDialog(null,motoristaDAO.calcular(motoristaDTO));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"ocorreu um erro");
        }
        
        
    }
}
