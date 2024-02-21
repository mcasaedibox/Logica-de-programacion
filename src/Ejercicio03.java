import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pide datos
        System.out.print("Ingrese un número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese un número: ");
        int b = sc.nextInt();
        System.out.print("Ingrese un número: ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.print("El número mayor es " + a);
            if (b > c) {
                System.out.print("El número mediano es " + b);
                System.out.print("El número menor es " + c);
            } else {
                System.out.print("El número del medio es: " + c);
                System.out.print("El número zenor ca: " + b);
            }
        }
        else if (b > a && b > c)
        {
            System.out.print("El número mayor es: " + b);
            if (a > c) {
                System.out.print("El número del medio es: " + a);
                System.out.print("El número del medio es: " + c);
            } else {
                System.out.print("El número del medio es: " + c);
                System.out.print("El número menor es: " + a);
            }
        }
        else {
            System.out.print("El número mayor es: " + c);
            if (a > b) {
                System.out.print("El número del medio es: " + a);
                System.out.print("El número menor es: " + b);
            } else {
                System.out.print("El número del medio es: " + b);
                System.out.print("El número menor es: " + a);
            }
        }
    }
}
