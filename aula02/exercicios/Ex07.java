package exercicios;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario;
        String continuar = "s";

        Locale localeBR = new Locale("pt","BR");
        NumberFormat real = NumberFormat.getCurrencyInstance(localeBR);

        System.out.println("\n--------INICIO---------\n");

        while(continuar.equals("s")){
            System.out.println("Digite o salário da pessoa\n");
            salario = teclado.nextDouble();

            if (salario <= 600.00)
                System.out.println("ISENTO");
            else if (salario <= 1200.00)
                System.out.println("20% = " + real.format(salario*0.2));
            else if (salario <= 2000.00)
                System.out.println("25% = " + real.format(salario*0.25));
            else
                System.out.println("30% = " + real.format(salario*0.3));

            System.out.println("\ntecle 's' para continuar");
            continuar = teclado.next();
        }

        System.out.println("\n--------FIM---------\n");
        teclado.close();
    }

}
