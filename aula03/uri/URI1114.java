package uri;

import java.util.Scanner;

public class URI1114 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        final int SENHA = 2002;
        int tentativa;

        while (true) {
            tentativa = teclado.nextInt();
            if(tentativa == SENHA)
                break;
            System.out.println("Senha Invalida");
        }

        System.out.println("Acesso Permitido");

        teclado.close();

    }

}
