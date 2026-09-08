package src;

import java.util.Scanner;

public class soma {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        int valor1 = scanner.nextInt();
        System.out.println("Digite o segundo valor:");
        int valor2 = scanner.nextInt();

        int soma = valor1 + valor2;

        System.out.println("A soma é: " + soma);
    }
}
