package algoritmos;

import java.util.Scanner;

/*
Se quiere determinar el tipo de persona según su edad:
Si es menor a 5 años es un bebé
Si es mayor a 5 y menor a 12 es un niño.
Si es mayor a 12 y menor que 25 es un adolescente.
Si es mayor a 25 y menor que 60 es adulto
Sino es adulto mayor
*/
     
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ing. la edad");
        int edad = ingreso.nextInt();
        
        if (edad <=5){
            System.out.println("Es un bebé");
        }else if(edad >5 & edad <=12){
            System.out.println("Es un niño");
        }else if(edad >12 & edad <=25){
            System.out.println("Es un adolescente");
        }else if(edad >25 & edad <=60){
            System.out.println("Es un adulto");
        }else{
            System.out.println("Es adulto mayor");
        }        
    } 
}
