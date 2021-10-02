package heranca;
import javax.swing.JOptionPane;
public class VeiculoVIEW {
    public static void main(String args[]){
        try{
            JOptionPane.showMessageDialog(null,"vamos trabalhar com o objeto carro");
            CarroDTO carroDTO = new CarroDTO();
            CarroDAO carroDAO = new CarroDAO();
            
            carroDTO.setPlaca(JOptionPane.showInputDialog("informe a placa do carro"));
            carroDTO.setCor(JOptionPane.showInputDialog("informe a cor"));
            carroDTO.setPotencia(Integer.parseInt(JOptionPane.showInputDialog("inmforme a potencia do carro")));
            carroDTO.setQtd_portas(Integer.parseInt(JOptionPane.showInputDialog("oinforme a potncia di caro")));
            
            JOptionPane.showMessageDialog(null,carroDAO.imprimirPlaca(carroDTO));
            JOptionPane.showMessageDialog(null,carroDAO.imprimirCor(carroDTO));
            JOptionPane.showMessageDialog(null,carroDAO.imprimirPotencia(carroDTO));
            JOptionPane.showMessageDialog(null,carroDAO.imprimir_qtd_porta(carroDTO));
            
            JOptionPane.showMessageDialog(null,"va,os trabalhar com o objeto moto");
            
            MotoDTO motoDTO = new MotoDTO();
            MotoDAO motoDAO = new MotoDAO();
            
            motoDTO.setPlaca(JOptionPane.showInputDialog("impromir a placa da moto"));
            motoDTO.setCilindrada(Integer.parseInt(JOptionPane.showInputDialog("impromir as cilindradas da moto")));
            motoDTO.setCor(JOptionPane.showInputDialog("impromir a Cor da moto"));
            motoDTO.setTipp_motor(JOptionPane.showInputDialog("impromir o tipo de motor da moto"));
            
             JOptionPane.showMessageDialog(null,motoDAO.imprimirCor(motoDTO));
             JOptionPane.showMessageDialog(null,motoDAO.imprimirPlaca(motoDTO));
             JOptionPane.showMessageDialog(null,motoDAO.imprimiCilindrada(motoDTO));
             JOptionPane.showMessageDialog(null,motoDAO.imprimiMotor(motoDTO));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"erro no sistema");
        }
    }//fecha main
}//fecha class
