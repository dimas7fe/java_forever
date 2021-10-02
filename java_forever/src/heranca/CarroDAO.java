package heranca;

public class CarroDAO extends VeiculoDAO {
    public String imprimirPotencia (CarroDTO carroDTO){
        return "A potência é "+ carroDTO.getPotencia();
    }
    
    public String imprimir_qtd_porta (CarroDTO carroDTO){
        return "A Quantidade de portas é "+ carroDTO.getQtd_portas();
    }
}
