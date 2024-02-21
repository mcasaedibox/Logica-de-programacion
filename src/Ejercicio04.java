import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pide datos
        System.out.print("Ingrese un número A: ");
        int a = sc.nextInt();
        System.out.print("Ingrese un número B: ");
        int b = sc.nextInt();

        if (a % b == 0){
            System.out.print("Multiplo");
        }
        else {
            System.out.print("No multiplo ");
        }
    }

}
