
package duveralexanderecue;


public class Triangulo {


    public static void main(String[] args) {
        
    int altura = 4; // Altura del triángulo

        for (int i = 1; i <= 4; i++) {
            // Imprime espacios en blanco para alinear el triángulo
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            // Imprime asteriscos para formar la parte superior e inferior del triángulo
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Salto de línea después de cada fila
            System.out.println();
        }
    }
}