package exemplos;

public class Ex04 {
    public static void main(String[] args) {
        int numeroInt;
        double numeroDouble;

        numeroInt = 200;
        numeroDouble = 10.99;

        //numeroDouble = numeroInt;
        numeroInt = (int)numeroDouble;

        System.out.println(numeroInt);
        System.out.println(numeroDouble);

        System.out.println(15d/7d);

        int outroInt = 27;
        numeroDouble = (double)outroInt / 97;

        System.out.println(numeroDouble);

    }
}
