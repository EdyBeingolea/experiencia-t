
public class Ejercicio3 {

    public static void main(String args[]) {
        Integer cantNros = 20, aux = 1;
        for (int j = 1; j <= cantNros; j++) {
            System.out.print(j * aux + "\t");
            aux = j * aux;
        }
    }
}
