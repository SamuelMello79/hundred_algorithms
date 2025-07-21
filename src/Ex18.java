import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        // 18. Faça um programa que leia um ângulo qualquer e mostre na tela o valor do seno, cosseno
        // e tangente dessa ângulo.

        Scanner scanner = new Scanner(System.in);
        double a, s, c, t;

        System.out.print("Digite o ângulo que você deseja: ");
        a = Math.toRadians(scanner.nextDouble()); // é necessário converter para radiando antes de passar

        s = Math.sin(a);
        c = Math.cos(a);
        t = Math.tan(a);

        System.out.printf("O ângulo de %.1f tem o SENO de %.2f\n", a, s);
        System.out.printf("O ângulo de %.1f tem o COSSENO de %.2f\n", a, c);
        System.out.printf("O ângulo de %.1f tem a TANGENTE de %.2f\n", a, t);

        scanner.close();
    }
}
