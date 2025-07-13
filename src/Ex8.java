import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        // 8. O usuário deverá passar uma medida em metros, e o código deverá retornar a conversão
        // para as demais medidas (km, hm, dam, m, dm, cm, mm)
        Scanner scan = new Scanner(System.in);
        double m;

        System.out.print("Digite um medida em metros: ");
        m = scan.nextDouble();

        System.out.println("A medida " + m + "m corresponde a: ");
        System.out.println((m / 1000) + "km");
        System.out.println((m / 100) + "hm");
        System.out.println((m / 10) + "dam");
        System.out.println((int) (m * 10) + "dm");
        System.out.println((int) (m * 100) + "cm");
        System.out.println((int) (m * 1000) + "mm");

        scan.close();
    }
}
