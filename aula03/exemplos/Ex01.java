package exemplos;

public class Ex01 {
    public static void main(String[] args) {
        int cont;
        cont = 1;

        
        System.out.println("Laço de repetição 'while'");
        while (cont < 10) {
            System.out.println("contador: " + cont);
            cont++;
        }
        cont = 1;
        System.out.println("contador fora do laço: " + cont);


        //Executa sempre a primeira iteração, independente se a condição é FALSA ou VERDADEIRA
        System.out.println("Laço de repetição 'do while'");
        do {
            System.out.println("contador: " + cont);
            cont++;
        } while (cont < 10);
        System.out.println("contador fora do laço: " + cont);
    }

}
