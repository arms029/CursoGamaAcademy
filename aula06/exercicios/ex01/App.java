package exercicios.ex01;

public class App {
    public static void main(String[] args) {

        ClubeFutebol corinthians = new ClubeFutebol("Corinthians",1);
        ClubeFutebol palmeiras = new ClubeFutebol("Palmeiras",1);

        ClubeFutebol flamengo = new ClubeFutebol("Flamengo",3);
        ClubeFutebol vasco = new ClubeFutebol("Vasco da gama");

        ClubeFutebol timeDesconhecido = new ClubeFutebol();
        ClubeFutebol timeDesconhecido2 = new ClubeFutebol(2);

        Placar placar = new Placar(corinthians, palmeiras);
        Placar placar2 = new Placar(flamengo, vasco);
        Placar placar3 = new Placar(timeDesconhecido, timeDesconhecido2);

        System.out.println(placar);
        System.out.println(placar2);
        System.out.println(placar3);
    }
}
