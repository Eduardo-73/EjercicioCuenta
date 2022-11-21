/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientacionObjetos;

import java.util.InputMismatchException;

/**
 *
 * @author eduardo
 */
public class MisSerie {

    public static void main(String[] args) {

        Serie simpson = new Serie("Los simpson", "Comedia", "...", "Fox", 32);

        System.out.println(simpson.toString());

        Serie house = new Serie();

        System.out.println(house);

        Serie prisonBreak = new Serie("Prison Break", "Suspense", "...", "AMC", 12, 474512);

        System.out.println(prisonBreak);

//        Serie peakBlinders = ServicioSerie.leerTecladoSerie();
//        
//        System.out.println(peakBlinders);
        ServicioSerie.darLike(prisonBreak);
        System.out.println(prisonBreak);
        ServicioSerie.darLike(simpson);
        System.out.println(simpson);

    }

}
