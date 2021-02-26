package exemplos;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor = 0;
        char resposta = 's';

        while (resposta == 's') {
            System.out.println("Digite um número: ");
            valor = Integer.parseInt(entrada.nextLine());

            System.out.println("Quer continuar? digite 's' para continuar");
            resposta = entrada.nextLine().toLowerCase().charAt(0);
        }

        System.out.println("valor final: " + valor);


        entrada.close();
    }
}
