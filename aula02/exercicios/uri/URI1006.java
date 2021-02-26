package exercicios.uri;

import java.util.Scanner;

public class URI1006 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n1, n2, n3, mediaPonderada;

        n1 = teclado.nextDouble();
        n2 = teclado.nextDouble();
        n3 = teclado.nextDouble();

        mediaPonderada = (n1*2 + n2*3 + n3*5) / 10;

        System.out.printf("MEDIA = %.1f\n",mediaPonderada);

        teclado.close();

    }
}
