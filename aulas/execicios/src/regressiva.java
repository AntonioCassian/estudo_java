package src;

import java.util.Scanner;

public class regressiva {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        System.out.println("===================");
        for (int i = numero; i > 0; i--) {
            System.out.println(i);
        }
        // int i = 0;

        // while (numero < i) {
        // System.out.println(i);
        // i--;
        // }

        scanner.close();
    }
}
