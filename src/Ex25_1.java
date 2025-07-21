import java.util.Scanner;

public class Ex25_1 {
    public static void main(String[] args) {
        // 25. Crie um programa que leia o nome de uma pessoa e diga se ela tem "SILVA" no nome
        Scanner scanner = new Scanner(System.in);
        String nome;

        System.out.print("Digite seu nome completo: ");
        nome = scanner.nextLine();

        // Aqui eu resolvi levando em considerando qualquer parte do nome que contenha a palavra SILVA
        // Ex: Silva, Silvana, Silvano
        System.out.println("Seu nome possui SILVA no nome? " + nome.toUpperCase().contains("SILVA"));

        scanner.close();
    }
}
