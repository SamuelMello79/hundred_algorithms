import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        // 15. Escreva um programa que pergunte a quantidade de Km percorridos por um carro
        // alugado e a quantidade de dias pelos quais foi alugado. Calcule o preço a pagar,
        // sabendo que o carro custo R$60 por dia e R$0,15 por Km rodado.

        Scanner scanner = new Scanner(System.in);
        int dias;
        double km, preco;

        System.out.print("Quantos dias alugados? ");
        dias = scanner.nextInt();

        System.out.print("Quantos Km rodados? ");
        km = scanner.nextDouble(); // preferi usar double, já que pode ser passado metros e não só km

        preco = (dias * 60) + (km * 0.15);
        System.out.printf("O total a pagar é de R$%.2f\n", preco);

        scanner.close();
    }
}
