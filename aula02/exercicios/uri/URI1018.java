package exercicios.uri;

import java.util.Scanner;

public class URI1018 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int total;
        int[][] notas = new int[7][2];

        //inicializando Array
        //contadores das notas
        notas[0][0] = 0;
        notas[1][0] = 0;
        notas[2][0] = 0;
        notas[3][0] = 0;
        notas[4][0] = 0;
        notas[5][0] = 0;
        notas[6][0] = 0;

        //notas
        notas[0][1] = 100;
        notas[1][1] = 50;
        notas[2][1] = 20;
        notas[3][1] = 10;
        notas[4][1] = 5;
        notas[5][1] = 2;
        notas[6][1] = 1;

        total = teclado.nextInt();
        System.out.println(total);

        for (int i = 0; i < notas.length; i++) {
            while (total / notas[i][1] >= 1) {
                total -= notas[i][1];
                notas[i][0]++;
            }
            System.out.printf("%d nota(s) de R$ %d,00\n", notas[i][0],notas[i][1]);
        }

        teclado.close();
    }

}
