package algoritmos;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {        
        // Calcula el cuadrado de los N primeros números naturales.
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ing. un nro");
        int N = lectura.nextInt();
        for (int p=1 ; p<=N ; p++){
            System.out.print(Math.pow(p,2) + "\t");
        }        
    }
 
}
