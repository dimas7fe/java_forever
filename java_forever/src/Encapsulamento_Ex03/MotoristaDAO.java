/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamento_Ex03;

/**
 *
 * @author Aluno
 */
public class MotoristaDAO {
    public String calcular (MotoristaDTO motoristaDTO){
    String resp;
    if(motoristaDTO.getIdade()<18){
    resp = "O motorista não pode tirar CNH";
    }
    else{
    resp = "o motorista pode tirar CNH";
    }
    return resp;
    }
}
