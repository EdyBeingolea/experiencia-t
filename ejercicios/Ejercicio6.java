package algoritmos;
import java.util.Scanner;

/* 
Dise�ar un algoritmo que pida por teclado tres n�meros:
 - si el primero es negativo,debe imprimir el producto de los tres
 - si no lo es, imprimir� la suma.

Shortcuts: atajos del IDE
sysout : System.out.println
   
 */

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
		System.out.println("Ing. el 1er. nro.");
		int nro1 = ingreso.nextInt();
		System.out.println("Ing. el 2do. nro.");
		int nro2 = ingreso.nextInt();
		System.out.println("Ing. el 3er. nro.");
		int nro3 = ingreso.nextInt();
		if (nro1 < 0) {
			System.out.println("El producto es: " + (nro1 * nro2 * nro3));
		} else {
			System.out.println("La suma es: " + (nro1 + nro2 + nro3));
		}

	}

}
