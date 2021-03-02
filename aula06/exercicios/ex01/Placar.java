package exercicios.ex01;

public class Placar {
    private ClubeFutebol primeiroTime;
    private ClubeFutebol segundoTime;

    public Placar(ClubeFutebol primeiroTime, ClubeFutebol segundoTime) {
        this.primeiroTime = primeiroTime;
        this.segundoTime = segundoTime;
    }

    public ClubeFutebol getPrimeiroTime() {
        return primeiroTime;
    }

    public ClubeFutebol getSegundoTime() {
        return segundoTime;
    }

    @Override
    public String toString() {
        return String.format("%s %d X %d %s",
            this.primeiroTime.getNome(),this.primeiroTime.getSaldoDeGols(),
            this.segundoTime.getSaldoDeGols(), this.segundoTime.getNome());
    }
}
