package src;

import java.util.Scanner;

public class ParSoma {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int numero2 = scanner.nextInt();
        // int numberPar =
        System.out.println("=======================");
        for (int i = numero1; i < numero2; i++) {
            int numberPar = i % 2;
            if (numberPar == 0) {
                System.out.println(i);
            }
        }
    }
}
