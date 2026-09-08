package src;

import java.util.Scanner;

public class fatorial {
    public static void executar() {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        int numeroFat = 1;
        System.out.println("================");
        for(int i = numero; i > 1; i--) {
              numeroFat = numeroFat * i;
        }
         System.out.println("O fatorial de " + numero + "! = " + numeroFat);
    }
}
