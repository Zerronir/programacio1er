import java.util.*;

public class Ex1 {

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
        int[] ordered = new int[3];

        // Demanam a l'usuari per cli els números
        System.out.println("Digues un número:");
        n1 = sc.nextInt();

        System.out.println("Digues un número:");
        n2 = sc.nextInt();

        System.out.println("Digues un número:");
        n3 = sc.nextInt();

        // Ordenam els números fent servir if's i else's
        if(n1 > n2 && n1 > n3) {
            ordered[0] = n1;

            if(n2 > n3){
                ordered[1] = n2;
                ordered[2] = n3;
            }else {
                ordered[1] = n3;
                ordered[2] = n2;
            }

        }else if (n1 < n2 && n2 > n3) {
            ordered[0] = n2;

            if(n1 > n3) {
                ordered[1] = n1;
                ordered[2] = n3;
            }else{
                ordered[1] = n3;
                ordered[2] = n1;
            }

        }else if (n1 < n3 && n2 < n3) {
            ordered[0] = n3;

            if(n1 > n2) {
                ordered[1] = n1;
                ordered[2] = n2;
            }else {
                ordered[1] = n2;
                ordered[2] = n1;
            }

        }


        System.out.println("L'ordre es el següent:" + ordered[0] + " " + ordered[1] + " " + ordered[2]);

    }

}
