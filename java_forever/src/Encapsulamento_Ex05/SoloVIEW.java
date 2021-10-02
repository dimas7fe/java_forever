/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamento_Ex05;
import javax.swing.JOptionPane;
public class SoloVIEW {
    public static void main(String args[]){
        try{
            SoloDTO soloDTO = new SoloDTO();
            SoloDAO soloDAO = new SoloDAO();
        
            soloDTO.setQtd_agua(Integer.parseInt(JOptionPane.showInputDialog("informe os pontos de água")));
        
            JOptionPane.showMessageDialog(null,soloDAO.conta_agua(soloDTO));
        
           
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,"ocorreu um erro");
        } 
   }
}
