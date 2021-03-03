package exercicios.ex01;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Animal cachorro = new Animal("cachorro","vira-lata", LocalDate.of(1991,10,28));
        Animal gato = new Animal("gato","gato vira-lata", LocalDate.of(1995,10,28), new Proprietario("Jorge", "(11) 91234-5678"));

        System.out.println(cachorro);
        System.out.println(gato);
    }
}
