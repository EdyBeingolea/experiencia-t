package algoritmos;

import java.util.Scanner;

// Leer tres números distintos y nos diga cuál de ellos es el mayor.

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
		System.out.println("Ing. el 1er. nro.");
		int nro1 = ingreso.nextInt();
		System.out.println("Ing. el 2do. nro.");
		int nro2 = ingreso.nextInt();
		System.out.println("Ing. el 3er. nro.");
		int nro3 = ingreso.nextInt();

		if(nro1 > nro2 & nro1 >nro3) {
			System.out.println("El nro. 1: es mayor");
		}else if (nro2 > nro3 & nro2 >nro1) {
			System.out.println("El nro. 2: es mayor");
		}else if (nro3 > nro2 & nro3 >nro1) {
			System.out.println("El nro. 3: es mayor");
		}
	}

}
