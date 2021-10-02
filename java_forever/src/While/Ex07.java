
package While;
import javax.swing.JOptionPane;
public class Ex07 {
    public static void main(String args[]){
        String letra="";
        int qtda=0,qtde=0,qtdi=0,qtdo=0,qtdu=0,qtdc=0;
        while (!letra.equalsIgnoreCase("0")){
             letra =  JOptionPane.showInputDialog("informe as letras");
           if(letra.equalsIgnoreCase("a")){
               qtda++;    
           }
           else{
              if(letra.equalsIgnoreCase("e")){
               qtde++;    
              }
              else{
                if(letra.equalsIgnoreCase("i")){
                qtdi++;    
                }
                else{
                  if(letra.equalsIgnoreCase("o")){
                  qtdo++;    
                  }
                  else{
                    if(letra.equalsIgnoreCase("u")){
                    qtdu++;    
                    }
                    else{
                      if(!letra.equalsIgnoreCase("0")){
                         qtdc++;
                      }
                    }
                  }
                }
              }
           }
        }
        JOptionPane.showMessageDialog(null,
                        "vogais:"+
                        "\nA: "+ qtda+
                        "\nE: "+qtde+
                        "\nI: "+qtdi+
                        "\nO: "+qtdo+
                        "\nU: "+qtdu+
                        "\nConsoantes: " +qtdc);
    }//fecha main
}
