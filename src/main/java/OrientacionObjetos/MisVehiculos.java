/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientacionObjetos;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class MisVehiculos {
    public static void main(String[] args) {
        //Istancia de la clase Scanner, llamada teclado
        Scanner teclado = new Scanner(System.in);
        
        Vehiculos v1 = new Vehiculos();
        //Vehiculos v3 = null Vehiculos();
        
        v1.setMatricula("1243RTR");
        v1.setColor("verde");
        
        System.out.println("La matrícula de v1 " + v1.getMatricula());
        System.out.println("Modelo de v1 " + v1.getModelo());
        
        Vehiculos ferrari = new Vehiculos();
        
        ferrari.setColor("rosa chicle");
        ferrari.setModelo("testarrosa");
        ferrari.setMarca("Ferrari");
        
        System.out.println("Color del ferrari " + ferrari.getColor());
        System.out.println("Modelo del ferrari " + ferrari.getModelo());
        System.out.println("Marca " + ferrari.getMarca());
        //Instaciamos una variable de tipo Vehiculo
        //con los datos que se pasa como parámetros 
        Vehiculos mercedes = new Vehiculos("123ER","2314324", 
              "Mercedes", "negro", "A1", 23.50, true);
        
        System.out.println("Mercedes tarifa " + mercedes.getTarifa());
        
//        Vehiculos jeep = new Vehiculos("1231E", "Azul", "146213");
//        
//        System.out.println("Jeep marca " + jeep.getMarca());
//        
//        System.out.println("Jeep matrícula " + jeep.getMatricula());
//        
//        jeep.setMatricula("0000ZZZ");
//        System.out.println("Jeep matrícula " + jeep.getMatricula());
//        //Se puede hacer de las dos formas
        System.out.println(mercedes.toString());
        System.out.println(mercedes);
        System.out.println(v1);
        
        //System.out.println(v3.toString());
       
    }
}
