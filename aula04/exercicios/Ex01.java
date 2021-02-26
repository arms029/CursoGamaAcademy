package exercicios;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroEntrada;

        System.out.println("Digite um número inteiro");
        numeroEntrada = teclado.nextInt();

        if (ehPar(numeroEntrada)) 
            System.out.println("O número é par");
        else
            System.out.println("O número é ímpar");

        teclado.close();
    }


    static boolean ehPar(int numero){
        if (numero % 2 == 0) 
            return true;
        return false;
    }
}
