import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        // 4. O usuário vai digitar algo e o sistema vai verificar:
        // - Qual o tipo primitivo desse valor
        // - Se é composto somente por espaços
        // - Se é um numero
        // - Se é alfabético
        // - Se é alfanumérico
        // - Se está em maiusculas
        // - Se está em minusculas
        // - Se está capitalizada

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite alguma coisa: ");
        var info = scan.nextLine();

        System.out.println("O tipo primitivo desse valor é: " + info.getClass().getName());
        System.out.println("Só tem espaços? " + (info.trim().isEmpty()));
        System.out.println("É um numero? " + (info.matches("-?\\d+(\\.\\d+)?")));
        System.out.println("É alfabético? " + (info.matches("[a-zA-Z]+")));
        System.out.println("É alfanumérico? " + (info.matches("[a-zA-Z0-9]+")));
        System.out.println("Está em maiúsculas? " + (info.equals(info.toUpperCase())));
        System.out.println("Está em minúsculas? " + (info.equals(info.toLowerCase())));
        System.out.println("Está captalizada? " + (info.equals(captilize(info))));
    }

    public static String captilize(String input) {
        String[] words = input.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word: words) {
            sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }
}
