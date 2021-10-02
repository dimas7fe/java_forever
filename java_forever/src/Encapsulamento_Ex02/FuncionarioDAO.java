
package Encapsulamento_Ex02;

public class FuncionarioDAO {
    public String imprimir(FuncionarioDTO funcionarioDTO){
        return "Código do funcionário: "+ funcionarioDTO.getCod() + "\n telefone do funcionário: "+funcionarioDTO.getTel();
    }
}
