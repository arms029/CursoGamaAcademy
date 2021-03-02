package exemplos.exemplo01;

public class App {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("João", 2000d);
        Gerente g = new Gerente("Jorge", 10000d, 90);

        System.out.println(f.exibir());
        System.out.println(g.exibir());

        f.aumentoSalarial(20);
        g.aumentoSalarial(20);

        System.out.println(f.exibir());
        System.out.println(g.exibir());


    }
}
