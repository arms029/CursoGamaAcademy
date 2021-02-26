package exercicios.uri;

import java.util.Scanner;

public class URI1048 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario, novoSalario, reajuste;

        salario = teclado.nextDouble();

        if (salario <= 400){
            reajuste = salario * 0.15;
            novoSalario = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 15 %");
        } else if (salario <= 800) {
            reajuste = salario * 0.12;
            novoSalario = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 12 %");
        } else if (salario <= 1200) {
            reajuste = salario * 0.10;
            novoSalario = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 10 %");
        } else if (salario <= 2000) {
            reajuste = salario * 0.07;
            novoSalario = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 7 %");
        } else {
            reajuste = salario * 0.04;
            novoSalario = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 4 %");
        }

        teclado.close();
    }

}
