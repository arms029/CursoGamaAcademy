package exercicios;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n1, n2, media;
        boolean aprovado;

        System.out.println("Digite a primeira nota");
        n1 = teclado.nextDouble();
        System.out.println("Digite a segunda nota");
        n2 = teclado.nextDouble();

        media = n1 * 0.4 + n2 * 0.6;
        
        aprovado = media >= 6.0;

        if (aprovado) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }

        teclado.close();
    }

}
