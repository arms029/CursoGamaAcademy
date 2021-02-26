package exemplos.ex03;

public class App {
    public static void main(String[] args) {
        Pessoa ricardo = new Pessoa("Ricardo",19,200.01);
        Pessoa joao = new Pessoa("João",37,5000.50);

        ricardo.apresentar();

        joao.apresentar();
    }
}
