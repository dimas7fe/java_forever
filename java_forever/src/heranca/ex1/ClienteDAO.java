package heranca.ex1;

public class ClienteDAO {
    public String mostraDadosCli(ClienteDTO clienteDTO){
        return "dados:"+"\n"+clienteDTO.getCidade()+
                "\n"+clienteDTO.getEndereco()+
                "\n"+clienteDTO.getEstado()+
                "\n"+clienteDTO.getNome()+
                "\n"+clienteDTO.getNumero();
    }
}
