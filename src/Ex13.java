import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        // 13. Faça um algoritimo que leia o salário de um funionário e mostre seu novo salário, com 15% de aumento
        double salario, novoSalario;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é o salário atual do funcionário? R$");
        salario = scanner.nextDouble();

        novoSalario = (salario * 0.15) + salario;

        System.out.printf("Um funcionário que ganhava R$%.2f, com 15%% de aumento, passa a receber R$%.2f\n", salario, novoSalario);
        scanner.close();
    }
}
