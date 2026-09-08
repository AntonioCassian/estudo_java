package src;

import java.util.Scanner;

public class MedZero {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero;

        System.out.println("Digite um número (0 para parar):");
        numero = scanner.nextInt();

        while (numero != 0) {
            soma += numero;
            System.out.println("Digite um número (0 para parar):");
            numero = scanner.nextInt();
        }

        double media = soma / 3.0;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}