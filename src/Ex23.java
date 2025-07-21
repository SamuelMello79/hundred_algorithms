import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        // 23. Faça um programa que leia um número de 0 a 9999 e mostre na tela cada um dos digítos separados
        // Ex:
        // digite um numero: 1834
        // unidade: 4, dezena: 3, centena: 8, milhar: 1

        Scanner scanner = new Scanner(System.in);
        int n, u, d, c, m;

        System.out.print("Informe um número: ");
        n = scanner.nextInt();

        u = n / 1 % 10;
        d = n / 10 % 10;
        c = n / 100 % 10;
        m = n / 1000 % 10;

        System.out.println("Analisando o número " + n);
        System.out.println("Unidade: " + u);
        System.out.println("Dezena: " + d);
        System.out.println("Centena: " + c);
        System.out.println("Milhar: " + m);

        scanner.close();
    }
}
