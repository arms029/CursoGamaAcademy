package exemplos.ex03;

import java.util.HashMap;

public class MapasDeHash {
    public static void main(String[] args) {
        HashMap<Integer, String> mapaHash = new HashMap<>();

        mapaHash.put(1,"Antonio");
        mapaHash.put(2,"Bianca");
        mapaHash.put(3,"Caio");
        mapaHash.put(4,"Daniel");

        System.out.println(mapaHash.get(3));
    }
}
