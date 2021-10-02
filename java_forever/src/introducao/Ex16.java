/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducao;

import javax.swing.JOptionPane;
public class Ex16 {
    public static void main(String args[]){
    Double veloc,litro,horas,gasto,dista;
    veloc = Double.parseDouble(JOptionPane.showInputDialog("informe a velocidade média"));
    litro = Double.parseDouble(JOptionPane.showInputDialog("informe quantos km o carro faz por litro"));
    horas = Double.parseDouble(JOptionPane.showInputDialog("informe o número de horas gastas"));
    dista = veloc * horas;//distancia percorrida
    gasto = dista / litro;//litros gastos
    
    JOptionPane.showMessageDialog(null,"o tempo de viagem foi: "+ horas+" horas"+
                                       "\na velocidade média foi: "+veloc+" km/h"+
                                       "\no número de litros gastos foi: "+gasto+" L"+
                                       "\na distância percorrida foi: "+dista+" km");
    }
    
}
