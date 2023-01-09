/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generico;

import java.time.LocalDate;

/**
 *
 * @author fer
 */
public class PRUEBA {
    
    public static void main(String[] args) {
        
        Empresa rentacar = new Empresa();
        rentacar.setNombre("Rentacar");
        
        Clientes c1 = new Clientes("pepe", "martinexz", "1");
        Clientes c2 = new Clientes("pepe2", "martinexz2", "2");
        
        
        Vehiculo v1 = new Vehiculo("1", "1", false, 1, "r", "r");
        Vehiculo v2 = new Vehiculo("2", "2", false, 1, "r", "r");
        
        
        rentacar.registrarCliente(c2);
        rentacar.registrarCliente(c1);
        
        rentacar.registrarVehiculo(v2);
        rentacar.registrarVehiculo(v1);
        
//        
//        Alquiler a1 = new Alquiler(c2, v2, LocalDate.now(), 4);
//        
//        
//        System.out.println(rentacar);
//        
//        rentacar.borrarClienteSinAlq(c2); //BORRAR CLIENTES QUE NO ESTEN EN EL ALQ
//        
//        rentacar.borrarVehiculoSinAlq(v2);
//        
//        System.out.println("-------------------------------------");
//        System.out.println("");
//        System.out.println(rentacar);
//        


        System.out.println(rentacar.devolverVehiculos(LocalDate.now()));
    }
    
}
