import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        // 2. O usuário deve digitar o nome, e o sistema deve retornar "É um prazer te conhecer, <nome>!".
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.printf("É um prazer te conhecer, %s", nome);
        scan.close();
    }
}
