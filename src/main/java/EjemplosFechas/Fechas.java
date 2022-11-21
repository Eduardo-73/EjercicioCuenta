/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosFechas;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 *
 * @author eduardo
 */
public class Fechas {

    public static void main(String[] args) {

        //Clase que guarda fechas
        //Guardar la fecha actual
        LocalDate fechaHoy = LocalDate.now();

        System.out.println("Año " + fechaHoy.getYear());
        System.out.println("Mes " + fechaHoy.getMonthValue());

        Month mesActual = fechaHoy.getMonth();

        System.out.println("Month " + mesActual);

       //Fecha concretas
       
       LocalDate fecha = LocalDate.of(2001, 11, 10);
       
        System.out.println(fecha);
        
        LocalDate fecha2 = LocalDate.of(2002, Month.NOVEMBER, 10);
        
        
        
        //Son iguales 
        if (fecha.equals(fecha2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son distintos");
        }
        //
        if (fecha.isBefore(fecha2)){
            System.out.println("fechas es anterior a fecha2 ");
        }
        //
        if(fecha.isAfter(fecha2)){
            System.out.println("fecha es posterior a fecha2 ");
        }
        
        //Clase para guarda mes y día (no el año)
        MonthDay nocheVieja = MonthDay.of(12,31);
        
        YearMonth añoMes = YearMonth.of(2023, 2);
        
        //Operaciones con fechas
        System.out.println("Hoy " + fechaHoy);
        System.out.println("Después de 100 días " + fechaHoy.plusDays(100));
        System.out.println("Hoy " + fechaHoy);
        
        LocalDate sumarMeses = fechaHoy.plusMonths(13);
        System.out.println("Después de 13 meses " + sumarMeses);
        
        LocalDate dosSigloDespues = sumarMeses.plus(2,ChronoUnit.CENTURIES);
        System.out.println(dosSigloDespues);
        
        long diferenciasDias = ChronoUnit.DAYS.between(fecha, fecha2);
        
        System.out.println("Dias entre fecha " + diferenciasDias);
        long years = ChronoUnit.YEARS.between(fecha, fecha2);
        
        System.out.println("Cuantos años hay entre fechas " + years);
        
        //Devuelve si el año de las fechas es bisiesto
        
        boolean esBisiesto = fechaHoy.isLeapYear();
        
        System.out.println("Días del mes actual " + fechaHoy.lengthOfMonth());
        
        Locale configLocal = Locale.getDefault();
        System.out.println("Fecha hoy Día " +      //FULL, SHORT
                fechaHoy.getDayOfWeek().getDisplayName(TextStyle.NARROW, configLocal));
        
         System.out.println("Fecha hoy Mes " +     
                mesActual.getDisplayName(TextStyle.FULL, Locale.CHINA));
         /**
          *dd día con dos numeritos
          * MM con dos numeritos 
          * yyyy año
         **/
         DateTimeFormatter formatoFechas = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         String fechaFormateada = fechaHoy.format(formatoFechas);
         System.out.println("Fecha formateada " + fechaFormateada);
    }
    

}
