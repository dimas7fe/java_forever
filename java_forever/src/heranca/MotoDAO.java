package heranca;

public class MotoDAO extends VeiculoDAO{
   public String imprimiCilindrada (MotoDTO motoDTO){
       return "A cilindrada é: "+ motoDTO.getCilindrada();
   }
   
   public String imprimiMotor (MotoDTO motoDTO){
       return "o tipo de motor é: "+motoDTO.getTipp_motor();
   }
}
