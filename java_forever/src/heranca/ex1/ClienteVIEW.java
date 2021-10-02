package heranca.ex1;
import javax.swing.JOptionPane;
public class ClienteVIEW {
    public static void main(String args[]){
        try{
            FisicoDTO fisicoDTO = new FisicoDTO();
            FisicoDAO fisicoDAO = new FisicoDAO();
            JuridicoDTO juridicoDTO = new JuridicoDTO();
            JuridicoDAO juridicoDAO = new JuridicoDAO();
            
            fisicoDTO.setNome(JOptionPane.showInputDialog("informe o nome"));
            fisicoDTO.setCidade(JOptionPane.showInputDialog("informe a cidade"));
            fisicoDTO.setEndereco(JOptionPane.showInputDialog("informe o endereço"));
            fisicoDTO.setEstado(JOptionPane.showInputDialog("informe o estado"));
            fisicoDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("informe o número")));
            fisicoDTO.setCpf(JOptionPane.showInputDialog("informe o CPF"));
            fisicoDTO.setRg(JOptionPane.showInputDialog("informe o RG"));
            
            juridicoDTO.setNome(JOptionPane.showInputDialog("informe o nome"));
            juridicoDTO.setCidade(JOptionPane.showInputDialog("informe a cidade"));
            juridicoDTO.setEndereco(JOptionPane.showInputDialog("informe o endereço"));
            juridicoDTO.setEstado(JOptionPane.showInputDialog("informe o estado"));
            juridicoDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("informe o número")));
            juridicoDTO.setCnpj(JOptionPane.showInputDialog("informe o CNPJ"));
            juridicoDTO.setIe(JOptionPane.showInputDialog("informe o IE"));
            
            JOptionPane.showMessageDialog(null, juridicoDAO.mostraDadosCli(juridicoDTO)+"\n"+juridicoDAO.mostraDadosJuri(juridicoDTO));
            JOptionPane.showMessageDialog(null,fisicoDAO.mostraDadosCli(fisicoDTO)+"\n"+fisicoDAO.mostraDadosFis(fisicoDTO));  
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "ocorreu um erro");
        }
    } 
}
