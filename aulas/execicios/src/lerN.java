package src;

import java.util.Scanner;

public class lerN {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        String result = numero > 0 ? "Positivo" : numero < 0 ? "Negativo" : "Zero";
        System.out.println("O número é " + result);

        scanner.close();
    }
}
