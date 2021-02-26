package exercicios;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        int soma = 0;

        while(numero != 0 || soma == 0){
            System.out.println("digite um número ou 0 para sair");
            soma += numero;
            numero = teclado.nextInt();
        }

        System.out.println("Soma = " + soma);
        teclado.close();
    }
}
