package algoritmos;

public class Ejercicio18 {
// Calcula el cuadrado de los N primeros números naturales aleatorios.
    public static void main(String[] args) { 
         
        int N = (int) (Math.random()*(20-11)) + 11;
        for (int p = 1; p <= N; p++) {
            System.out.print(p*p + "\t");
        }
        
        /* Ejercicio 17        
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ing. un nro");
        int N = lectura.nextInt();
        for (int p = 1; p <= N; p++) {
            System.out.print(p + "\t");
        }
        */
        
        /* Ejercicio 16        
        for (int p = 1; p <= 9; p++) {
            System.out.print(p + "\t");
        }   
        */
    }

}
