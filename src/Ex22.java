import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        // 22. Crie um programa que leia o nome completo de uma pessoa e mostre:
        // O nome com todas as letras em maiúsculas  minúsculas
        // Quantas letras ao todas (sem considerar espaços)
        // Quantas letras tem o primeiro nome
        Scanner scanner = new Scanner(System.in);
        String nome;

        System.out.print("Digite seu nome completo: ");
        nome = scanner.nextLine();

        System.out.println("Analisando seu nome: ");
        System.out.println("Seu nome em maiúsculas é " + nome.toUpperCase());
        System.out.println("Seu nome em minúsculas é " + nome.toLowerCase());
        System.out.printf("Seu nome ao todo tem %d letras\n", nome.replace(" ", "").length());
        System.out.printf("Seu primeiro nome é %s e ele tem %d letras", nome.split("\\s")[0], nome.split("\\s")[0].length());

        scanner.close();
    }
}
