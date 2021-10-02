/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamento_Ex05;

public class SoloDAO {
    public String conta_agua(SoloDTO soloDTO){
        String resp;
        if(soloDTO.getQtd_agua() < 80){
            if(soloDTO.getQtd_agua()<=80 && soloDTO.getQtd_agua()>40){
            resp = "o tipo de solo é pantanoso";
            }
            else{
                if(soloDTO.getQtd_agua()<=40 && soloDTO.getQtd_agua()>10){
                    resp = "o tipo de solo é firme";
                }
                else{
                    resp = "o tipo de solo é rochoso";
                }
            }
        }
        else{
        resp = "quantidade de agua invalida";
        }
        System.out.println(soloDTO);
        return resp;
    }
}
