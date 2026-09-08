package src;

import java.util.Scanner;

public class maior {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int valor1 = scanner.nextInt();
        System.out.println("Digite outro número:");
        int valor2 = scanner.nextInt();
        String result = valor1 > valor2 ? valor1 + " é maior"
                : valor2 > valor1 ? valor2 + " é maior" : "Os números são iguais";
        System.out.println(result);
    }
}
