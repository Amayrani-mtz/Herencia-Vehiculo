
package com.mycompany.transportes;

public class Transportes {

    public static void main(String[] args) {
        VehiculoTerrestre vehiculoTerrestre=new VehiculoTerrestre("Ford","Mustang", 4);
        VehiculoAcuatico vehiculoAcuatico=new VehiculoAcuatico("Lancha","Yamaha", "Motor Prr Prr");
        VehiculoAereo vehiculoAereo=new VehiculoAereo("Volaris","Vuela Compañia de Aviacion", 2);
        VehiculoEspacial vehiculoEspacial=new VehiculoEspacial("Virgin Galactic","NASA", 6);

        System.out.println("Información del vehículo Terrestre");
        vehiculoTerrestre.mostrarInfo();
        System.out.println("Información del vehículo Acuático");
        vehiculoAcuatico.mostrarInfo();
        System.out.println("Información del vehiculo Aereo");
        vehiculoAereo.mostrarInfo();
        System.out.println("Información del vehiculo Espacial");
        vehiculoEspacial.mostrarInfo();
    }
}
