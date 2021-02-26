package uri;

import java.util.Scanner;

public class URI1117 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double nota, soma = 0;
        int cont = 0;

        while (cont < 2) {
            nota = teclado.nextDouble();
            if(nota >= 0 && nota <= 10){
                soma += nota;
                cont++;
            }
            else{
                System.out.println("nota invalida");
            }
        }

        System.out.printf("media = %.2f\n",soma/2);

        teclado.close();

    }

}
