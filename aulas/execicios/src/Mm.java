package src;

import java.util.Scanner;

public class Mm {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adicione 5 números:");
        int numero = scanner.nextInt();
        int maior = numero;
        int menor = numero;
        int i = 0;
        while (i < 4) {
            numero = scanner.nextInt();

    if (numero > maior) {
        maior = numero;
    }

   if (numero < menor) {
    menor = numero;
}
            i++;
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

        scanner.close();
    }
}
