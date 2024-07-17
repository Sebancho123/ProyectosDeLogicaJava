package com.mycompany.ejercicospracticos;

import java.util.Scanner;

public class EjercicosPracticos {

    public static void main(String[] args) {

        //ejercicio el usuario ingres aun numero y el programa los muestra
        /*int numero;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de veses q quiere q se muestre");
        numero = teclado.nextInt();
        
        for (int i=1; i <= numero; i++) {
            System.out.println("voy en el numero: " + i);
        }*/
 /*
        //bluce para cuando el ususario pongs salir se detenga el while
        String palabra;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        palabra = teclado.next();

        while (!palabra.equalsIgnoreCase("salir")) {
            System.out.println("La palabra es: " + palabra);

            System.out.println("Ingrese una palabra");
            palabra = teclado.next();
        }*/
        //ejercico de catyergorias
        /*
        String dni;
        String nombre;
        int edad;
        String categoria;

        System.out.println("Ingrese su dni");
        Scanner teclado = new Scanner(System.in);
        dni = teclado.next();

        System.out.println("Ingrese su nombre");
        Scanner teclado2 = new Scanner(System.in);
        nombre = teclado2.next();

        System.out.println("Ingrese su edad");
        Scanner teclado3 = new Scanner(System.in);
        edad = teclado3.nextInt();

        while (!dni.equals("0") && !nombre.equalsIgnoreCase("fin")) {

            if (edad >= 6 && edad <= 10) {

                categoria = "Menores A";
                System.out.println("Su dni : " + dni + " su nombre " + nombre + " y su categoria es : " + categoria);

            } else {
                if (edad >= 11 && edad <= 17) {

                    categoria = "Menores B";
                    System.out.println("Su dni : " + dni + " su nombre" + nombre + " y su categoria es : " + categoria);

                } else {

                    if (edad >= 18 && edad <= 30) {

                        categoria = "Juveniles";
                        System.out.println("Su dni : " + dni + " su nombre" + nombre + " y su categoria es : " + categoria);

                    } else {
                        if (edad >= 31 && edad <= 50) {

                            categoria = "Adultos";
                            System.out.println("Su dni : " + dni + " su nombre" + nombre + " y su categoria es : " + categoria);

                        } else {

                            categoria = "Adultos mayores";
                            System.out.println("Su dni : " + dni + " su nombre" + nombre + " y su categoria es : " + categoria);

                        }

                    }

                }
            }

            System.out.println("Ingrese su dni");
            Scanner teclado4 = new Scanner(System.in);
            dni = teclado.next();

            System.out.println("Ingrese su nombre");
            Scanner teclado5 = new Scanner(System.in);
            nombre = teclado2.next();

            System.out.println("Ingrese su edad");
            Scanner teclado6 = new Scanner(System.in);
            edad = teclado3.nextInt();

        }*/
        int altura=4;

        for (int fila = 0; fila < altura; fila++) {
            
            for (int espacio=0; espacio<(altura-fila)-1; espacio++){
                System.out.print(" ");
            }
            
            for (int acterisco=0; acterisco <(fila*2)+1; acterisco++) {
                System.out.print("*");
            }
            
            System.out.println("");
                
        }
        
        for (int largoBase=0; largoBase < 1; largoBase++) {
            
            for (int espacio=0; espacio < altura-1; espacio++) {
                System.out.print(" ");
            }
            
            for (int tronco=0; tronco < 2; tronco++) {
                System.out.print("|");
            }
            
            //System.out.println("");
            
        }
        
    }

}
