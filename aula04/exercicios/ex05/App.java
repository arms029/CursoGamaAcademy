package exercicios.ex05;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Ebook livro = new Ebook("O príncipe","Nicolau Maquiavel",150);

        livro.avancarPagina();
        livro.irParaPagina(3);
        livro.retrocederPagina(3);
        System.out.println("página atual: " + livro.getPagina());
        livro.mostrarCapa();

        teclado.close();
    }
}
