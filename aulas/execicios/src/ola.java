package src;

import java.util.Scanner;

public class ola {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
          System.out.println("Olá, " + nome + "!");

    }
}
