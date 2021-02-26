package uri;

import java.util.Scanner;

public class URI1064 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double numero, somaPositivos = 0;
        int positivos = 0;

        for (int i = 0; i < 6; i++) {
            numero = teclado.nextDouble();
            if (numero >= 0) {
                positivos++;
                somaPositivos += numero;
            }
        }

        System.out.println(positivos + " valores positivos");
        System.out.printf("%.1f\n",somaPositivos/4d);

        teclado.close();

    }

}
