import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        int lado1, lado2;
        double hipo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la longitud de un lado del triangulo:");
        lado1 = sc.nextInt();

        System.out.println("Dime la longitud del otro lado del triangulo:");
        lado2 = sc.nextInt();

        hipo = calcHip(lado1, lado2);


        System.out.println("La hipotenusa es: " + hipo);
    }

    public static double calcHip(int lado1, int lado2){
        double cud1, cud2, sumCuad;
        double hip;
        cud1 = Math.pow(lado1, 2);
        cud2 = Math.pow(lado2, 2);

        sumCuad = cud1 + cud2;
        hip = Math.sqrt(sumCuad);
        return hip;
    }

}
