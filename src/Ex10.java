import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        // 10. Crie um programa que leia quanto dinheiro ma pessoa tem na carteira
        // e mostre quantos dólares ela pode comprar
        // Considere US$ 1,00 = R$3.27
        Scanner scan = new Scanner(System.in);

        System.out.print("Quanto dinheiro você tem na carteira? R$");
        double valor = scan.nextDouble();

        System.out.printf("Com R$%.2f você pode comprar US$%.2f\n", valor, valor / 3.27);

        scan.close();
    }
}
