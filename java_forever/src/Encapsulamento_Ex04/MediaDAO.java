/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamento_Ex04;

public class MediaDAO {
    public String calcular(MediaDTO mediaDTO){
        double media;
        String resp;
        media = (mediaDTO.getN1()+mediaDTO.getN2())/2;
        if (media<7){
        resp = "o aluno está reprovado";
        }
        else{
        resp = "o aluno está aprovado";
        }
        return resp;
    }
}
