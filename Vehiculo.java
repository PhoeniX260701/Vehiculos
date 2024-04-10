public class Vehiculo {
    protected String Marca;
    protected String Modelo;
    
    public Vehiculo (String Marca,String Modelo){
        this.Marca=Marca;
        this.Modelo=Modelo;
    }
    public void mostarInfo(){
        System.out.println("Marca: " + Marca); 
        System.out.println("Modelo: " + Modelo);
    }
}