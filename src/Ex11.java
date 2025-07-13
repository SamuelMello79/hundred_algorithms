import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        // 11. Faça um programa que leia a largura e a altura de uma parede em que metros, calcule a sua área
        // e a quantidade de tinta necessária para pinta-lá, sabcendo que cada litro de tinta, pinta uma área
        // de 2m².
        Scanner scan = new Scanner(System.in);
        double alt, larg, area, lit;

        System.out.print("Largura da parede: ");
        larg = scan.nextDouble();

        System.out.print("Altura da parede: ");
        alt = scan.nextDouble();

        area = larg * alt;
        lit = area / 2;

        System.out.printf("Sua parede tem a dimensão de %.2fx%.2f e sua área é de %.3fm²\n", larg, alt, area);
        System.out.printf("Para pintar essa parede, você precisará de %.4fl de tinta\n", lit);

        scan.close();
    }
}
