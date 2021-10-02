/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamento_Ex04;
import javax.swing.JOptionPane;

public class MediaVIEW {
    public static void main (String args[]){
        try{
            MediaDTO mediaDTO = new MediaDTO();
            MediaDAO mediaDAO = new MediaDAO();
        
            mediaDTO.setN1(Double.parseDouble(JOptionPane.showInputDialog("informe a nota 1")));
            mediaDTO.setN2(Double.parseDouble(JOptionPane.showInputDialog("informe a nota 2")));

            JOptionPane.showMessageDialog(null,mediaDAO.calcular(mediaDTO));
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"ocorreu um erro");
        }
    }
}



