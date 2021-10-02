
package heranca;

public class MotoDTO extends VeiculoDTO {
    private int cilindrada;
    private String Tipp_motor;//2T ou 4T

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipp_motor() {
        return Tipp_motor;
    }

    public void setTipp_motor(String Tipp_motor) {
        this.Tipp_motor = Tipp_motor;
    }
    
    
}
