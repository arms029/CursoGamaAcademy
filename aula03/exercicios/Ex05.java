package exercicios;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, pares = 0;
        final int QTDE_NUMEROS = 10;

        for (int i = 0; i < QTDE_NUMEROS; i++) {
            System.out.println("Digite um número:");
            numero = Integer.parseInt(teclado.nextLine());
            //if ternário
            pares += (numero % 2 == 0 ? 1 : 0);
        }

        System.out.printf("Quantidade de números pares = %d\nQuantidade de números Ímpares = %d",pares, (QTDE_NUMEROS - pares));
        teclado.close();
    }
}
