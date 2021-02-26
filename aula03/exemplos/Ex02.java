package exemplos;

public class Ex02 {
    public static void main(String[] args) {
        int cont, soma;
        cont = 0;
        soma = 0;

        System.out.println("Laço de repetição 'while'");
        while (cont < 5) {
            System.out.print(cont + " + ");
            soma += cont;
            cont++;
        }
        System.out.println(" = " + soma);

    }
}
