package src;

import java.util.Scanner;

public class tabuada {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        System.out.println("=======================");
        for (int i = 0; i < 11; i++) {
            System.out.println(numero + "x" + i + " = " + numero * i);
        }
    }
}
