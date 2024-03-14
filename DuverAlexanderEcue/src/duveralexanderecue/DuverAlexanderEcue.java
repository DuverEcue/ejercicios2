
package duveralexanderecue;

import java.util.Scanner;


public class DuverAlexanderEcue {



    public static void main(String[] args) {
        
        Scanner enteros = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int numero1 = enteros.nextInt();

        System.out.println("Ingrese el segundo número:");
        int numero2 = enteros.nextInt();

        System.out.println("Ingrese el tercer número:");
        int numero3 = enteros.nextInt();

        int mayor = numero1;

        if (numero2 > mayor) {
            mayor = numero2;
        }

        if (numero3 > mayor) {
            mayor = numero3;
        }

        System.out.println("El número mayor es: " + mayor);
    }
}

