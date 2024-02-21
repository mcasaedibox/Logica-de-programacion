import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Pido datos de entrada
        System.out.print("Ingrese primer número: " );
        int a = sc.nextInt();

        System.out.print("Ingrese segundo número: " );
        int b = sc.nextInt();

        System.out.print("Ingrese tercer número: " );
        int c = sc.nextInt();

        //Realizamos las comparaciones
        if (a > b && a > c){
            System.out.print("Elmayor número: " + a );
        } else if (b > a && b > c) {
            System.out.print("Elmayor número: " + b );
        } else {
            System.out.print("Elmayor número: " + c );
        }


    }
}
