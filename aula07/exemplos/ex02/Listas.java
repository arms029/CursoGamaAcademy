package exemplos.ex02;

import java.util.ArrayList;

public class Listas {
    public static void main(String... args){
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        listaNumeros.add(9);
        listaNumeros.add(56);
        listaNumeros.add(54);
        listaNumeros.add(32);
        listaNumeros.add(57);

        for (int i = 0; i < listaNumeros.size(); i++) {
            System.out.println("procurando...");
            if(listaNumeros.get(i) == 56){
                System.out.println("achei");
                break;
            }
        }

        for (Integer numero : listaNumeros){
            System.out.println("procurando...");
            if(numero == 56){
                System.out.println("achei");
                break;
            }
        }

    }
}
