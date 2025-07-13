import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        // 12. Faça um algoritmo que leia o preço de um produto e mostre seu novo preço, com 5% de desconto
        Scanner scan = new Scanner(System.in);
        double preco, desc;

        System.out.print("Qual é o preço do produto? R$");
        preco = scan.nextDouble();

        desc = preco * 0.05;

        System.out.printf("O produto que custava R$%.2f, na promoção com desconto de 5%% vai custar %.2f", preco, preco - desc);

        scan.close();
    }
}
