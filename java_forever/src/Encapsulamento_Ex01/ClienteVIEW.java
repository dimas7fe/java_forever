
package Encapsulamento_Ex01;

import javax.swing.JOptionPane;
public class ClienteVIEW {
    public static void main(String args[]){
        try{
            ClienteDTO clienteDTO = new ClienteDTO();
            ClienteDAO clienteDAO = new ClienteDAO();
            
            clienteDTO.setNome(JOptionPane.showInputDialog("informe o seu nome"));
            clienteDTO.setRg(JOptionPane.showInputDialog("informe seu RG"));
            clienteDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("informe sua idade")));
            
            JOptionPane.showMessageDialog(null, clienteDAO.mostrarNomeRg(clienteDTO));
            JOptionPane.showMessageDialog(null, clienteDAO.mostrarNomeIdade(clienteDTO));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"erro no sistema: "+ e.getMessage());
        }
    }//fecha main
}//fecha class
