import java.net.Socket;
public class Transportes{
public static void main(String[]args){
    //Crear un vehiculo
VehiculoTerrestre vehiculoTerrestre =new VehiculoTerrestre("Mattel","Terreneitor",4);
VehiculoAcuatico vehiculoAcuatico=new VehiculoAcuatico("Lancha","Yamaha","Motor");
VehiculoAereo vehiculoAereo=new VehiculoAereo("Aereo","NighMare", 2);
VehiculoEspacial vehiculoEspacial=new VehiculoEspacial("NASA", "APOLO", 6);

    //Mostrar informaacion de los vehiculos
    System.out.println("Informacion del vehiculo terrestre:");
    vehiculoTerrestre.mostarInfo();
    System.out.println("Informacion del vehiculo acuatico:");
    vehiculoAcuatico.mostarInfo();
    System.out.println("Informacion del vehiculo aereo:");
    vehiculoAereo.mostarInfo();
    System.out.println("Informacion del vehiculo espacial:");
    vehiculoEspacial.mostarInfo();
    }
}    