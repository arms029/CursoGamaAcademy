package exercicios;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println("7 + 5 = " + (7+5));
        System.out.println("7 - 5 = " + (7-5));
        System.out.println("7 * 5 = " + (7*5));
        System.out.println("7 / 5 = " + (7d/5d));
        System.out.println(soma(1,2,3,4,5,6,7,8,9));
    }

    
    public static double soma(double... parcelas){
        double soma = 0d;
        String texto = "";

        for (double parcela : parcelas) {
            soma += parcela;
            texto += parcela + " + ";
        }

        texto = texto.substring(0, texto.length()-2) + "= ";
        System.out.print(texto);

        return soma;
    }
}
