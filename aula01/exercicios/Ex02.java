package exercicios;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1;
        double n2;
        double media;

        System.out.println("Digite a primeira nota do aluno");
        n1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota do aluno");
        n2 = entrada.nextDouble();

        media = (n1+n2)/2;

        System.out.println("a média final é: " + media);

        entrada.close();
    }
}
