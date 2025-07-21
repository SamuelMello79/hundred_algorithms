import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        // 16. Crie um programa que leia um numero Real qualquer pelo teclado e mostre na tela sua porção
        // inteira.
        // ex: Digite um numero: 6.123
        // O numero 6.123 tem a parte inteira 6

        Scanner scanner = new Scanner(System.in);
        double valor;

        System.out.print("Digite um numero: ");
        valor = scanner.nextDouble();

        System.out.printf("O valor digitado foi %f sua porção inteira é %d\n", valor, (int) valor);

        scanner.close();
    }
}
