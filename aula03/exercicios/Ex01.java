package exercicios;

public class Ex01 {
    public static void main(String[] args) {
        int cont = 100;
        final int LIMITE_DO_LACO = 201;
        
        System.out.println("Laço de repetição 'while'");
        while (cont < LIMITE_DO_LACO) {
            System.out.print(cont + " ");
            cont++;
        }

    }

}
