package exercicios;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int limite;
        int cont = 1;

        System.out.println("Digite o número limite");
        limite = teclado.nextInt();

        // while(cont <= limite){
        //     if((limite - cont) >= cont)
        //         System.out.print(cont + ", ");
        //     else
        //         System.out.print(cont);
        //     cont *= 2;
        // }

        //mais eficiente, porém precisa validar a entrada, por exemplo, se digitar o limite 0, printará 1, que está errado!!!
        while(cont <= limite/2){
            System.out.print(cont + ", ");
            cont *= 2;
        }
        System.out.print(cont);


        teclado.close();
    }
}
