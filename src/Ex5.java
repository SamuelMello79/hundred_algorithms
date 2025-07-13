import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        // 5. Crie um programa que vai receber um numero, e vai retornar o numero antecessor e o posterior
        int num, ant, suc;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num = scan.nextInt();
        ant = num  - 1;
        suc = num + 1;
        System.out.printf("Analisando o valor %d, seu antecessor é %d e o sucessor %d.", num, ant, suc);

    }
}
