package exercicios;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n1, n2, media;
        boolean aprovado,exame;

        System.out.println("Digite a primeira nota");
        n1 = teclado.nextDouble();
        System.out.println("Digite a segunda nota");
        n2 = teclado.nextDouble();

        media = n1 * 0.4 + n2 * 0.6;
        
        aprovado = media >= 7.0;
        exame = media >= 5.0;

        System.out.printf("Média final: %.1f\n",media);

        if (aprovado)
            System.out.println("APROVADO");
        else if (exame)
            System.out.println("EXAME");
        else
            System.out.println("REPROVADO");

        teclado.close();
    }

}
