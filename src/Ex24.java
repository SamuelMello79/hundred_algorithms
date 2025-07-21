import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        // 24. Crie um programa que leia o nome de uma cidade e diga se ela começa ou não com nome "SANTO"
        Scanner scanner = new Scanner(System.in);
        String cidade;

        System.out.print("Em que cidade você nasceu? ");
        cidade = scanner.nextLine();

        System.out.println(nomeComecaComSanto(cidade));

        scanner.close();
    }

    public static boolean nomeComecaComSanto(String cidade) {
        return cidade.split("\\s")[0].equalsIgnoreCase("SANTO");
    }
}