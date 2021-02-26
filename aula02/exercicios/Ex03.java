package exercicios;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n1, n2;

        
        System.out.println("Digite n1");
        n1 = teclado.nextDouble();
        System.out.println("Digite n2");
        n2 = teclado.nextDouble();


        if(n1 > n2)
            System.out.println(n1 + " e " + n2);
        else
            System.out.println(n2 + " e " + n1);


        teclado.close();
    }

}
