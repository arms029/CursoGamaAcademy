package exercicios;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String senha;
        boolean senhaAceita;
        
        System.out.println("Digite a senha");
        senha = teclado.nextLine();

        senhaAceita = senha.equals("R10p5");

        if(senhaAceita)
            System.out.println("acesso concedido");
        else
            System.out.println("acesso negado");

        teclado.close();
    }

}
