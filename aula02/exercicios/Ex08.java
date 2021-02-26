package exercicios;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a,b,c;
        String continuar = "s";

        System.out.println("\n--------INICIO---------\n");

        while(continuar.equals("s")){
            System.out.println("Digite os 3 lados do triângulo\n");
            a = teclado.nextDouble();
            b = teclado.nextDouble();
            c = teclado.nextDouble();

            boolean naoEhTriangulo = (a > b + c) || (b > a + c) || (c > b + c);
            boolean equilatero = (a == b) && (b == c);
            boolean isosceles = (a == b) || (b == c) || (c == a);
            
            if (naoEhTriangulo)
                System.out.println("não é um triângulo");
            else if (equilatero)
                System.out.println("triângulo EQUILÁTERO");
            else if (isosceles)
                System.out.println("triângulo ISÓSCELES");
            else
                System.out.println("triângulo ESCALENO");

            System.out.println("\ntecle 's' para continuar");
            continuar = teclado.next();
        }

        System.out.println("\n--------FIM---------\n");
        teclado.close();
    }

}
