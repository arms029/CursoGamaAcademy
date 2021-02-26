package uri;

import java.util.Scanner;

public class URI1066 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero;
        int positivos = 0, negativos = 0, pares = 0, impares = 0;

        for (int i = 0; i < 5; i++) {
            numero = teclado.nextInt();

            if (numero > 0) 
                positivos++;
            else if (numero < 0)
                negativos++;

            if (numero % 2 == 0) 
                pares++;
            else
                impares++;
            
        }

        System.out.printf("%d valor(es) par(es)\n",pares);
        System.out.printf("%d valor(es) impar(es)\n",impares);
        System.out.printf("%d valor(es) positivo(s)\n",positivos);
        System.out.printf("%d valor(es) negativo(s)\n",negativos);

        teclado.close();

    }

}
