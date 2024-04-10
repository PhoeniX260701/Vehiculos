public class VehiculoTerrestre extends Vehiculo{
    private int NumLlantas;
public VehiculoTerrestre (String Marca,String Modelo, int NumLlantas){
    super(Marca, Modelo);
    this.NumLlantas=NumLlantas;
    }
    public void mostarInfo(){
        super.mostarInfo();
        System.out.println("Numero de llantas: " + NumLlantas); 
    }
}
