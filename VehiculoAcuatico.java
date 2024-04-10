public class VehiculoAcuatico extends Vehiculo{
    private String TipoPropulsion;
public VehiculoAcuatico (String Marca,String Modelo,String TipoPropulsion){
    super(Marca, Modelo);
    this.TipoPropulsion=TipoPropulsion;
    }
    public void mostarInfo(){
       super.mostarInfo();
       System.out.println("Tipo de propulsion: " + TipoPropulsion);   
    }
}
