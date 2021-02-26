package exemplos;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Digite um valor inteiro menor que 10: ");
            numero = entrada.nextInt();
        } while (numero >= 10);
        
        entrada.close();
    }
}
