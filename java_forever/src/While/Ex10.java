
package While;

import javax.swing.JOptionPane;
public class Ex10 {
    public static void main(String args[]){
    int c9=0,c12=0,c23=0,c40=0,td=0,c=1,cout=0;
    double pc9,pc12,pc23,pc40,pcout;
        while(c!=0){
            c = Integer.parseInt(JOptionPane.showInputDialog("informe o canal"));
            if(c!=0){
            td++;
            }
            if((c == 9)){
                c9++;
            }
            else{
                if(c==12){
                    c12++;
                }
                else{
                    if(c==23){
                        c23++;
                    }
                    else{
                        if(c==40){
                            c40++;
                        }
                        else{
                            if(c !=0){
                            cout++;
                            }
                        }
                    }
                }
            }
        }
        pc9 = (c9 * 100)/td;
        pc12 = (c12 * 100)/td;
        pc23 = (c23 * 100)/td;
        pc40 = (c40 * 100)/td;
        pcout = (cout * 100)/td;
        JOptionPane.showMessageDialog(null, "canal 9: "+pc9+"%\n"+
                                            "canal 12: "+pc12+"%\n"+
                                            "canal 23: "+pc23+"%\n"+
                                            "canal 40: "+pc40+"%\n"+
                                            "outros canais: "+pcout+"%\n");
    }
}
