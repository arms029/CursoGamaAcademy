package exemplos;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número inteiro");
        numero = teclado.nextInt();

        if (numero > 0) {
            System.out.println("o número é positivo");
        } else if (numero < 0){
            System.out.println("o número é negativo");
        } else {
            System.out.println("o número é igual a zero");
        }

        teclado.close();
    }

}
