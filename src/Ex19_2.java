import java.util.Random;
import java.util.Scanner;

public class Ex19_2 {
    public static void main(String[] args) {
        // 19. Um professor quer sortear um dos seus quatro alunos para apagar o quadro. Faça um programa
        // que ajude ele, lendo o nome deles e escrevendo o nome do escolhido.

        Scanner scanner = new Scanner(System.in);
        String[] alunos = new String[4];
        String escolhido;

        for (int i = 0; i < alunos.length; i++) {
            System.out.printf("Digite o nome do %dº aluno: ", i + 1);
            alunos[i] = scanner.nextLine();
        }

        Random rand = new Random();
        escolhido = alunos[rand.nextInt(alunos.length)]; // gera um numero respeitando o intervalo do array
        System.out.println("Aluno escolhido foi " + escolhido);

        scanner.close();
    }

}
