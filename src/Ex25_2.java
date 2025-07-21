import java.util.Scanner;

public class Ex25_2 {
    public static void main(String[] args) {
        // 25. Crie um programa que leia o nome de uma pessoa e diga se ela tem "SILVA" no nome
        Scanner scanner = new Scanner(System.in);
        String nome;

        System.out.print("Digite seu nome completo: ");
        nome = scanner.nextLine();

        System.out.println("Seu nome possui SILVA no nome? " + verificaSeTemSilva(nome));

        scanner.close();
    }

    // Aqui ele só vai dar OK se contiver uma parte do nome que seja igual a SILVA
    public static boolean verificaSeTemSilva(String nome) {
        String[] sobrenomes = nome.split("\\s");
        for (String sobrenome: sobrenomes) {
            if (sobrenome.equalsIgnoreCase("SILVA")) {
                return true;
            }
        }
        return false;
    }
}
