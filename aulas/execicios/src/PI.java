package src;

import java.util.Scanner;

public class PI {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");

        int numero = scanner.nextInt();
        int resto = numero % 2;
        String result = resto == 0 ? "Par" : "Impar";

        System.out.println(result);
    }
}
