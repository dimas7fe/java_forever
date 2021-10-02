package heranca;

public class VeiculoDAO {
    public String imprimirPlaca(VeiculoDTO veiculoDTO){
        return "A placa é "+ veiculoDTO.getPlaca();
    }
    public String imprimirCor(VeiculoDTO veiculoDTO){
        return "A cor é "+ veiculoDTO.getCor();
    }
}
