import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        // 20. O mesmo professor do desafio anterior quer sortear a ordem de apresentação de trabalho dos alunos.
        // Faça um programa que leia o nome dos quatro alunos e mostra a ordem sorteada.
        List<String> alunos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.printf("Digite o nome do %dº aluno: ", i + 1);
            alunos.add(scanner.nextLine());
        }

        Collections.shuffle(alunos); // Metodo para embaralharar os itens na lista

        System.out.println("A ordem de apresentação será: ");
        System.out.println(alunos);

        scanner.close();
    }
}
