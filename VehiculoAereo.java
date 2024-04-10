public class VehiculoAereo extends Vehiculo{
    private int NumAlas;
    public VehiculoAereo (String Marca,String Modelo, int NumAlas){
    super(Marca, Modelo);
    this.NumAlas=NumAlas;
    }
    public void mostarInfo(){
    super.mostarInfo();
    System.out.println("Numero de alas: " + NumAlas); 
    }
}
    
