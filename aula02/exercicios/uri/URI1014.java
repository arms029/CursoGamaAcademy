package exercicios.uri;

import java.util.Scanner;

public class URI1014 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int distanciaPercorrida;
        double combustivelGasto, taxaConsumo;

        distanciaPercorrida = teclado.nextInt();
        combustivelGasto = teclado.nextDouble();

        taxaConsumo = distanciaPercorrida / combustivelGasto;

        System.out.printf("%.3f km/l\n",taxaConsumo);

        teclado.close();
    }

}
