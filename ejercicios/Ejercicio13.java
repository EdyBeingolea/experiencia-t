package algoritmos;
// Calcular el área de un terreno cuadrilátero,
// al ingresar el ancho y el largo.
// Además, nos diga si es un Cuadrado o Rectángulo.

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        float ancho = 0f; // un = es asignación
        float largo = 0;
//        float ancho3 = 0.0f;
        System.out.println("Ing. el ancho");
        ancho = ingreso.nextFloat();
        System.out.println("Ing. el largo");
        largo = ingreso.nextFloat();
        if (ancho == largo) { // un == es comparación (Boolean)
            System.out.println("Es un cuadrado");
        } else {
            System.out.println("Es un rectángulo");
        }
        System.out.println("El área es: " + (ancho*largo));
    }

}
