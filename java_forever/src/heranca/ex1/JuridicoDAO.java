/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca.ex1;

/**
 *
 * @author Aluno
 */
public class JuridicoDAO extends ClienteDAO {
    public String mostraDadosJuri(JuridicoDTO juridicoDTO){
        return "dados juridico"+"\n"+ juridicoDTO.getCnpj()+
                "\n"+juridicoDTO.getIe();
    }
}
