/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Francisco Benitez
 */
public class Fecha {
      Date fechaActual = new Date();
        
        
        //Formateando la fecha:
        DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        
        //Fecha actual desglosada:
        Calendar fecha = Calendar.getInstance();
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH) + 1;
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
        int segundo = fecha.get(Calendar.SECOND);

        
        public String devuelveFecha(){
            String fecha;
        System.out.println("Fecha Actual: "+ dia + "/" + (mes) + "/" + año);
        System.out.printf("Hora Actual: %02d:%02d:%02d %n", hora, minuto, segundo);
        System.out.println("-------------Fecha desglosada----------------");
        System.out.println("El año es: "+ año);
        System.out.println("El mes es: "+ mes);
        System.out.println("El día es: "+ dia);
        System.out.printf("La hora es: %02d %n", hora);
        System.out.printf("El minuto es: %02d %n", minuto);
        System.out.printf("El segundo es: %02d %n", segundo);
        
        return fecha = ("FechaActual"+dia+"/"+(mes)+"/"+año);
        }
        		
    }

