package exercicios.uri;

import java.util.Scanner;

public class URI1003 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, soma;

        // Locale localeBR = new Locale("pt","BR");
        // NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

        n1 = teclado.nextInt();
        n2 = teclado.nextInt();

        soma = n1 + n2;

        System.out.println("SOMA = " + soma);
        teclado.close();

    }
}
