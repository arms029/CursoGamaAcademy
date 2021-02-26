package exercicios;
import java.math.BigDecimal;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        BigDecimal salario, salarioNovo = new BigDecimal("0");  //double salario, salarioNovo;

        System.out.println("Digite o salário do funcionário");
        salario = entrada.nextBigDecimal();                     //salario = entrada.nextDouble();

        salarioNovo = salario.multiply(new BigDecimal("1.25")); //salarioNovo = salario*1.25;

        System.out.println("o salário final é: " + salarioNovo);

        entrada.close();
    }
}
