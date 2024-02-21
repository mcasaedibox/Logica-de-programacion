import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pide datos
        System.out.print("Ingrese un número año: ");
        int a = sc.nextInt();

        if (esBisiesto(a)){
            System.out.print("Año bisiesto: ");
        }
        else {
            System.out.print("Año no bisiesto ");
        }
    }

    public static boolean esBisiesto(int a) {

        if (a % 4 == 0) {
            if (a % 100 == 0) {
                if (a % 400 == 0) {
                    return true;
                } else {
                    return  false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
