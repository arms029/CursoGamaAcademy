package exercicios;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1,n2,n3, menor;

        n1 = digiteNumero(teclado);
        n2 = digiteNumero(teclado);
        n3 = digiteNumero(teclado);

        menor = getMenor(n1, n2, n3);

        System.out.printf("O menor número é: %d", menor);
        teclado.close();
    }

    static int digiteNumero(Scanner teclado){
        System.out.println("Digite um número inteiro");
        return teclado.nextInt();
    }

    static int getMenor(int n1, int n2, int n3){
        if (n1 < n2 && n1 < n3)
            return n1;
        else if (n2 < n3)
            return n2;
        return n3;
    }
}
