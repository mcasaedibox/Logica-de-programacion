import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pide datos
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        if (numero % 2==0){
            System.out.print("Sí es par");
        }
        else{
            System.out.print("NO es par");
        }

    }
}
