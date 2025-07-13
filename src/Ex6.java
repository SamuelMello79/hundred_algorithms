import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        // 6. O usuário deve inserir um valor, e o programa deverá retornar o dobro, o triplo e a raiz quadrada
        // deste valor.
        int numero, dobro, triplo;
        double raiz;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        numero = scan.nextInt();
        dobro = numero * 2;
        triplo = numero * 3;
        raiz = Math.sqrt(numero);
        System.out.printf("O dobro de %d vale %d\n", numero, dobro);
        System.out.printf("O triplo de %d vale %d\n", numero, triplo);
        System.out.printf("A raiz quadrada de %d vale %.2f\n", numero, raiz); // .2f para arredondar as casas

    }
}
