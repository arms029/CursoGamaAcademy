package exemplos.ex05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class testeExcessoes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 999;

        do {
            try {
                System.out.println("Digite um número inteiro:");
                numero = Integer.parseInt(teclado.nextLine());
            } catch (InputMismatchException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("saindo...");
            }
        } while (numero != 0);


        

        teclado.close();
    }
}
