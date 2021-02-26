package exemplos;

import java.math.BigDecimal;

public class Ex02 {
    public static void main(String[] args) {

        int[] numerosInteiro = { 1, 2, 3, 4 };
        float[] numerosFloat = { 1.4f, 2.2f, 3f, 4f };
        double[] numerosDouble = {2d, 20d, 17.17d, 4.2d};
        BigDecimal[] numerosBigDecimal = {
            new BigDecimal("2"),
            new BigDecimal("20"),
            new BigDecimal("17.17"),
            new BigDecimal("4.2")
        };

        System.out.println(somar(numerosInteiro));
        System.out.println(somar(numerosFloat));
        System.out.println(somar(numerosDouble));

    }

    //sobrecarga de métodos públicos e estáticos
    public static double somar(double... parcelas){
        double soma = 0;
        for (double parcela : parcelas) {
            soma += parcela;
        }
        return soma;
    }

    public static int somar(int... parcelas){
        int soma = 0;
        for (int parcela : parcelas) {
            soma += parcela;
        }
        return soma;
    }
    public static float somar(float... parcelas){
        float soma = 0;
        for (float parcela : parcelas) {
            soma += parcela;
        }
        return soma;
    }
    // public static BigDecimal somar(BigDecimal parcelas){
    //     BigDecimal soma = new BigDecimal("0");
    //     for (BigDecimal parcela : parcelas) {
            
    //     }
    //     return soma;
    // }
}
