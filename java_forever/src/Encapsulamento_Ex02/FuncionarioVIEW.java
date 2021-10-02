
package Encapsulamento_Ex02;
import javax.swing.JOptionPane;
public class FuncionarioVIEW {
    public static void main(String args[]){
        try{    
            FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
            FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        
            funcionarioDTO.setCod(Integer.parseInt(JOptionPane.showInputDialog("informe o código do funcionário")));
            funcionarioDTO.setTel(JOptionPane.showInputDialog("informe o telefone do funcionário"));
        
            JOptionPane.showMessageDialog(null,funcionarioDAO.imprimir(funcionarioDTO));
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,"ocorreu um erro");
        }
    }//fecha main
}//fecha class
