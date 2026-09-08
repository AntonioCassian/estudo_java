package src;

import java.util.Scanner;

public class UmaN {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        System.out.println("=======================");
        int soma = 0;
        String somaStr = "";

        for (int i = 1; i <= numero; i++) {
            soma = soma + i;
            somaStr = somaStr + i;

            if (i < numero) {
                somaStr = somaStr + " + ";
            }
        }

        System.out.println(somaStr + " = " + soma);
    }
}
