import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        // 14. Escreva um programa que converta uma temperatura digitada em ºC e converta para ºF e ºK.
        Scanner scanner = new Scanner(System.in);
        double c, f, k;

        System.out.print("Informe a temparatura em ºC: ");
        c = scanner.nextDouble();

        k = c + 273;
        f =  ((c / 5) * 9) + 32;

        System.out.printf("A temperatura de %.1fºC corresponde a: \n", c);
        System.out.printf("Fahrenheit: %.1fºF\n", f);
        System.out.printf("Kelvin: %.0fºK\n", k);

        scanner.close();
    }
}
