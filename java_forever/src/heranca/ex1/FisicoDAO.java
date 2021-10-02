
package heranca.ex1;

public class FisicoDAO extends ClienteDAO {
    public String mostraDadosFis(FisicoDTO fisicoDTO){
        return "cliente Fisico:"+"\n"+fisicoDTO.getCpf()+
                "\n"+fisicoDTO.getRg();
    }
}
