package exemplos;

public class Ex01 {
    public static void main(String... args){
        final int COMPRIMENTO = 50;

        repetirCharln(COMPRIMENTO,'-');
        repetirChar(1,'|');
        repetirChar(48,' ');
        repetirCharln(1,'|');
        repetirCharln(COMPRIMENTO,'-');
        System.out.println(repetirCharln(50,(char)126));
        System.out.println(repetirCharln(0,(char)126));

    }


    static void helloWorld(){
        System.out.println("Hello World!");
    }


    static boolean repetirChar(int tamanho, char tipo){
        if (tamanho == 0) {
            return false;
        }
        for (int i = 0; i < tamanho; i++) {
            System.out.print(tipo);
        }
        return true;
    }


    static boolean repetirCharln(int tamanho, char tipo){
        if (tamanho == 0) {
            return false;
        }
        for (int i = 0; i < tamanho; i++) {
            System.out.print(tipo);
        }
        System.out.println();
        return true;
    }


}
