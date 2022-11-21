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
public class ServicioSerie {

    private static Scanner teclado = new Scanner(System.in);

    //Lee por teclado los datos de una serie y devuelve el objeto creado
    public static Serie leerTecladoSerie() {
        //Creamos el objeto de tipo serie

        Serie serie;
        //Leer por teclado y instanciar
        System.out.println("Nombre de la serie ");
        String nombreSerie = teclado.nextLine();
        System.out.println("Género de la serie ");
        String genero = teclado.nextLine();
        System.out.println("Sinopsis de la serie ");
        String sinopsis = teclado.nextLine();
        System.out.println("Productora de la serie ");
        String productora = teclado.nextLine();
        System.out.println("Número de temporadas de la serie ");
        int temporadas = teclado.nextInt();
        System.out.println("Número de likes de la serie ");
        int likes = teclado.nextInt();
        teclado.nextLine();
        serie = new Serie(nombreSerie, genero, sinopsis, productora, temporadas, likes);
        //Devolvemos el tipo Serie
        return serie;
    }

    public static void darLike(Serie serie) {

        System.out.println("Te gusta la serie " + serie.getTitulo() + " ?");
        String respuesta = teclado.nextLine();
        if(respuesta.equalsIgnoreCase("si")){
            serie.darLike();
        }
    }
}
