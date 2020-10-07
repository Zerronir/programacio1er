import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex1_v2 {

    public static void main(String[] args) {
        /**
         *
         * Exercici 1: Ordenar número pel seu valor
         *
         * @param n1, n2, n3 seràn de tipus int
         * @param sc serà de tipus Scanner per emmagatzemar els números
         * @return retornam una llista
         *
         **/

        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        List<Integer> ordered = new ArrayList<Integer>();
        int comptador = 0;

        // Demanam a l'usuari per cli els números
        System.out.println("Digues un número:");
        n1 = sc.nextInt();

        System.out.println("Digues un número:");
        n2 = sc.nextInt();

        System.out.println("Digues un número:");
        n3 = sc.nextInt();

        ordered.add(n1);
        ordered.add(n2);
        ordered.add(n3);
        Collections.sort(ordered);

        for(int i : ordered){
            System.out.println(i);
        }
    }

}
