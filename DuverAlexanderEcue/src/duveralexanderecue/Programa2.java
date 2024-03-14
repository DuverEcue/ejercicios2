
package duveralexanderecue;

import java.util.Scanner;


public class Programa2 {

    public static void main(String[] args) {
        
        Scanner mayor = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int numero1 = mayor.nextInt();

        System.out.println("Ingrese el segundo número:");
        int numero2 = mayor.nextInt();

        if (numero1 == numero2) {
            System.out.println("Los números son iguales. Su multiplicación es: " + (numero1 * numero2));
        } else if (numero1 > numero2) {
            System.out.println("El primer número es mayor. La resta es: " + (numero1 - numero2));
        } else {
            System.out.println("El segundo número es mayor. La suma es: " + (numero1 + numero2));
        }
    }
}