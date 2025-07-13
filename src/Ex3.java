import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        // 3. O usuário deve dar o input de 2 valores e o código deve retornar a soma dos mesmos
        int valor1, valor2, soma;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        valor1 = scan.nextInt();

        System.out.print("Digite outro valor: ");
        valor2 = scan.nextInt();

        soma = valor1 + valor2;

        System.out.printf("A soma entre %d e %d é igual a %d", valor1, valor2, soma);
        scan.close();
    }
}
