import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        // 9. O usuário deverá digitar um numero, e o código irá exibir a tabuada desse numero
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número para ver sua tabuada: ");
        int num = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", num, i, num * i);
        }

        scan.close();
    }
}
