package exercicios;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double taxaDistribuidor = 0.28, taxaImposto = 0.45, custoDeFabrica, custoFinal, totalImpostos;

        Locale localeBR = new Locale("pt","BR");
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

        System.out.println("Digite o valor do custo de fábrica do carro");
        custoDeFabrica = entrada.nextDouble();

        custoFinal = custoDeFabrica + (custoDeFabrica * (taxaDistribuidor + taxaImposto));
        totalImpostos = custoDeFabrica * (taxaImposto);

        System.out.println("O custo de fábrica é: " + dinheiro.format(custoDeFabrica));
        System.out.println("O custo final ao consumidor é: " + dinheiro.format(custoFinal));
        System.out.println("O total de impostos a ser pago é : " + dinheiro.format(totalImpostos));

        entrada.close();
    }
}
