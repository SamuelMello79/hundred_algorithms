import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        // 7. O usuário deverá dar entrada em duas notas e o código deverá retornar a média dessas duas notas
        Scanner scan = new Scanner(System.in);
        double n1, n2, media;

        System.out.print("Digite a primeira nota: ");
        n1 = scan.nextDouble();

        System.out.print("Digite a segunda nota: ");
        n2 = scan.nextDouble();

        media = (n1 + n2) / 2;
        System.out.printf("A média entre %.1f e %.1f é igual a %.1f\n", n1, n2, media);

        scan.close();
    }
}
