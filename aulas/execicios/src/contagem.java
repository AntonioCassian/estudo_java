package src;

import java.util.Scanner;

public class contagem {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        System.out.println("===================");
        for (int i = 0; i < numero; i++) {
            System.out.println(i+1);
        }

        scanner.close();
    }
}
