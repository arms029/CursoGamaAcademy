package exercicios;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, somaPares = 0, pares = 0;
        final int QTDE_NUMEROS = 3;

        for (int i = 0; i < QTDE_NUMEROS; i++) {
            System.out.println("Digite um número:");
            numero = Integer.parseInt(teclado.nextLine());

            if(numero % 2 == 0){
                somaPares += numero;
                pares++;
            }
        }

        try {
            System.out.println("Média dos pares: " + somaPares/pares);
        } catch (ArithmeticException e) {
            System.out.println("Não há números pares!!!");
        }

        System.out.printf("%% de ímpares: %.2f%%",(QTDE_NUMEROS - pares)*((double)100/QTDE_NUMEROS));
        teclado.close();
    }
}
