package exemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File ("exemplos\\loremIpsum.txt");
        Scanner texto = new Scanner(file);
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número inteiro");
        numero = entrada.nextInt();

        System.out.println("você digitou: " + numero);

        while(texto.hasNextLine())
            System.out.println(texto.nextLine());

        entrada.close();
        texto.close();
    }
}
