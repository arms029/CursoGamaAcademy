package exercicios;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario, prestacao;
        boolean liberarEmprestimo;
        
        System.out.println("Digite o valor do salário");
        salario = teclado.nextDouble();
        System.out.println("Digite o valor da prestacao");
        prestacao = teclado.nextDouble();

        liberarEmprestimo = prestacao < (0.3 * salario);

        if(liberarEmprestimo)
            System.out.println("empréstimo liberado");
        else
            System.out.println("empréstimo negado");

        teclado.close();
    }

}
