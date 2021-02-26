package exercicios;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioMin, qtdeKWh, valKWh, valorTotal, valorTotalComDesconto;

        Locale localeBR = new Locale("pt","BR");
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

        System.out.println("Digite o valor do salário mínimo");
        salarioMin = entrada.nextDouble();

        System.out.println("Digite a qtde de KWh");
        qtdeKWh = entrada.nextDouble();

        valKWh = salarioMin / 500;
        valorTotal = qtdeKWh * valKWh;
        valorTotalComDesconto = valorTotal * 0.85;

        System.out.println("O valor do KWh é: " + dinheiro.format(valKWh));
        System.out.println("O valor total a ser pago é: " + dinheiro.format(valorTotal));
        System.out.println("O valor total a ser pago com desconto é : " + dinheiro.format(valorTotalComDesconto));

        entrada.close();
    }
}
