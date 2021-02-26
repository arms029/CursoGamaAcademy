package exercicios.uri;

import java.util.Scanner;

public class URI1010 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int id, qtde, id2, qtde2;
        double valor, valor2, total;

        id = teclado.nextInt();
        qtde = teclado.nextInt();
        valor = teclado.nextDouble();
        total = qtde * valor;

        id2 = teclado.nextInt();
        qtde2 = teclado.nextInt();
        valor2 = teclado.nextDouble();
        total += qtde2 * valor2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);

        teclado.close();

    }
}
