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
         * @output retornam una llista empleant Collections per mostrar una ArrayList de Integers
         *
         **/

        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        List<Integer> ordered = new ArrayList<Integer>();

        // Demanam a l'usuari per cli els números
        System.out.println("Digues un número:");
        n1 = sc.nextInt();

        System.out.println("Digues un número:");
        n2 = sc.nextInt();

        System.out.println("Digues un número:");
        n3 = sc.nextInt();

        // Afegim els nombres a la llista
        ordered.add(n1);
        ordered.add(n2);
        ordered.add(n3);
        // Ordenam la llista fent servir un objecte Collections
        Collections.sort(ordered);

        // Feim un bucle per a llistar els nombres ordenats pel seu valor
        /**
         *
         *  Emplearem un bucle for on i serà un valor int que començarà en 0 i que anirà incrementant-se en funció
         *  del valor de la longitud de la llista que li passem ens anirà imprimint per pantalla els números ordenats
         *  pel seu valor
         *
         * */
        for(int i : ordered){
            System.out.println(i);
        }
    }

}
