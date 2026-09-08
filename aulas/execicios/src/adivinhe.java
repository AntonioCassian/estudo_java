package src;

import java.util.Scanner;

public class adivinhe {
    public static void executar() {
        int NC = 37;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        while (numero != NC) {
            if (numero > NC) {
                System.out.println("Muito Alto");
            } else {
                System.out.println("Muito Baixo");
            }
            System.out.println("Digite outro número:");
            numero = scanner.nextInt();
        }
        System.out.println("Acertou!");
        scanner.close();
    }
}
