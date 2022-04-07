
public class Ejercicio2 {

    public static void main(String args[]) {
        // Shortcuts: atajos del IDE
        // sout : System.out.println
        // psvm : public static void main(String args[]) {
        System.out.println("Ing. la cantidad de nros.");
        
        Integer cantNros = 10;
        
        for (int k = 1; k <= cantNros; k++) {
            System.out.print(k + "\t" + k * -1 + "\t");
        }
    }
}
