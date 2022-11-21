/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package OrientacionObjetos;

/**
 *
 * @author eduardo
 */
public class Vehiculos {

    //Atributos
    private String matricula;
    private String bastidor;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;//Precio alquiler día
    private boolean disponible;//Aquilado o libre

    //Constructores
//    public Vehiculos(String matr, String bas, String mar, 
//    String col, String model, double tarif, boolean disponi){
//        //Matrícula de este objeto es igual a la matrícula parámetro       
//        this.matricula = matr;
//        this.color = col;
//        this.bastidor = bas;
//        this.disponible = disponi;
//        this.marca = mar;
//        this.tarifa = tarif;
//        this.modelo = model;
//    }
    
    public Vehiculos(){  
    }
    
//    public Vehiculos(String matricula, String color, String bastidor){
//        this.matricula = matricula;
//        this.color = color;
//        this.bastidor = bastidor;
//    }
    public Vehiculos(String matricula, String bastidor, String marca, String modelo, String color, double tarifa, boolean disponible) {
        this.matricula = matricula;
        this.bastidor = bastidor;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }
    

    //Métodos Get
//    
//    public String getMatricula(){
//        return this.matricula;
//    }
//    
//    //Método Set
//    
//    public void setMatricula(String matricula){
//        this.matricula = matricula;
//    }
//    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Vehiculos{" + "matricula=" + matricula + ", bastidor=" + bastidor + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tarifa=" + tarifa + ", disponible=" + disponible + '}';
    }
    
}
