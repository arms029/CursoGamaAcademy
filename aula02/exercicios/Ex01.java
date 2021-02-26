package exercicios;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1;

        System.out.println("Digite um número inteiro");
        n1 = teclado.nextInt();

        if (n1 > 20) {
            System.out.println("A metade desse número é: " + (n1/2.0));
        }

        teclado.close();
    }

}
