package exercicios;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Digite o número da tabuada que você desejar");
        numero = teclado.nextInt();

        for (int i = 0; i < 11; i++) {
            // System.out.printf("%d x %2d = %3d\n", numero,i,(numero * i));
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }

        teclado.close();
    }
}
