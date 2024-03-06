package com.mycompany.practica;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Practica {
    
     
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // para medir la longitud de una variables.
        /*
        String nombre;
        nombre = "this is java"; 
        int longitud = nombre.length();
        System.out.println(" la cantidad de caracteres" + "   " + longitud);
         */
    //------------------------------------------------------------------------
        // desmenuce el string "java" mostradolo por pantalla
       /* String txt = "JAVA";
        char carater = txt.charAt(4);
        System.out.println("caracteres",´+ , caracter);
        */
       /* String nombre = "JAVA";
      //----------------------------------------------------------------------  
        for (int x=0;
             x<nombre.length();
             x++)
        System.out.println("Caracter " + x + ": " + nombre.charAt(x));
*/
        //---------------------------------------------------------------------
        // seleccionar la tercera letra de java
      /*  String nombre = "java";
        System.out.println("la tercera posicion es" + "  "+ nombre.charAt(2));
*/
        //--------------------------------------------------------------------
        // para invertir la palabra
        /*
        String nombre = "java desde 0";
        StringBuilder nombre1 = new StringBuilder(nombre);
		nombre = nombre1.reverse().toString();
		System.out.println(nombre);
*/
        //--------------------------------------------------------------------
            // para eliminar espacios intermedio de la oracion
            /*
           String nombre1 = "James Gosling Created Java";
           System.out.println(nombre1.replace(" ",""));
    */
            /*
          String nombre1 = "James Gosling Created Java";
          String nombre = nombre1.replace(" ","");
          System.out.println(nombre);
*/
            //-----------------------------------------------------
            
          // sub cadenas de una variable
          /*
          // usando quitar espacion y medir si tiene una subcadenas con puntos dados
          String nombre = "James Gosling Created Java";
          String nombre1 = nombre.replace(" ","");
          String subcadena = nombre1.substring(13, 19);
          System.out.println(subcadena);
          
          String nombre3 = "James Gosling Created Java";
          String subcadena1 = nombre3.substring(13, 19);
          System.out.println(subcadena);
            */
          //------------------------------------------
          
       /*   
    String texto1 = " abc ".strip();
String texto2 = " abc ".trim();
String texto3 = " abc ".stripLeading();
String texto4 = " abc ".stripTrailing();
        System.out.println(texto1);
       System.out.println(texto2);
       System.out.println(texto3);
       System.out.println(texto4);
*/
       //----------------------------------------------------
     float nota =1f;
     int cantidad_estudiantes=0;
     float notas_acumuladas = 0f;
     float promedio = 0f;
     
      Scanner tc = new Scanner (System.in); 
      
      System.out.println("ingrese una nota");
           nota = tc.nextFloat();
           
      while ( nota > 0 ) {    
           if (nota > 0){
           cantidad_estudiantes++;
               notas_acumuladas = notas_acumuladas + nota;  
               promedio = notas_acumuladas/cantidad_estudiantes;
           }
      }
           
           System.out.println("el promedio de notas: " + promedio);
    }
}