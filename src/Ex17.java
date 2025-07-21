import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        // 17. Faça um programa que leia o comprimento do cateto oposto e do cateto adjacente de um
        // triangulo retângulo. Calcule e mostre o comprimento da hipotenusa.

        Scanner scanner = new Scanner(System.in);
        double co, ca, h;

        System.out.print("Comprimento do cateto oposto: ");
        co = scanner.nextDouble();

        System.out.print("Comprimento do cateto adjacente: ");
        ca = scanner.nextDouble();

        // c² = a² + b² - Teorema de Pítagoras
        h = Math.sqrt(Math.pow(ca, 2) + Math.pow(co, 2));
        System.out.printf("A hipotenusa vai medir %.2f", h);

        scanner.close();
    }
}
