import java.util.Scanner;

public class Ex19_1 {
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

        escolhido = alunos[getNumeroAleatorio()];
        System.out.println("Aluno escolhido foi " + escolhido);
    }

    public static int getNumeroAleatorio() {
        // Math.random() -> retorna um numero entre 0.0 e 1.0
        return (int) (Math.random() * 4); // gera um numero aleatorio entre 0 e 3
    }
}
