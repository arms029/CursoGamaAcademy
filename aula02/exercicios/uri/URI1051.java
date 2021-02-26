package exercicios.uri;

import java.util.Scanner;

public class URI1051 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario, i1, i2, i3, impostos;

        salario = teclado.nextDouble();

        if (salario <= 2000) {
            System.out.println("Isento");
        } else if (salario <= 3000){
            i1 = (salario - 2000) * 0.08;
            impostos = i1;
            System.out.printf("R$ %.2f\n",impostos);
        } else if (salario <= 4500){
            i1 = (1000) * 0.08;
            i2 = (salario - 3000) * 0.18;
            impostos = i1 + i2;
            System.out.printf("R$ %.2f\n",impostos);
        } else {
            i1 = (1000) * 0.08;
            i2 = (1500) * 0.18;
            i3 = (salario - 4500) * 0.28;
            impostos = i1 + i2 + i3;
            System.out.printf("R$ %.2f\n",impostos);
        }

        teclado.close();
    }

}
