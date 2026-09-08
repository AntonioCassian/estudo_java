package src;

import java.util.Scanner;

public class media {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primera nota:");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota:");
        double nota3 = scanner.nextDouble();

        double soma = (nota1 + nota2 + nota3) / 3;

        String result = soma >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(result);
    }
}