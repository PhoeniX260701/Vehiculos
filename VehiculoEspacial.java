public class VehiculoEspacial extends Vehiculo {
    private int NumTurbinas;
    public VehiculoEspacial (String Marca,String Modelo, int NumTurbinas){
        super(Marca, Modelo);
        this.NumTurbinas=NumTurbinas;
        }
        public void mostarInfo(){
            super.mostarInfo();
            System.out.println("Numero de turbinas: " + NumTurbinas); 
        }
    }
