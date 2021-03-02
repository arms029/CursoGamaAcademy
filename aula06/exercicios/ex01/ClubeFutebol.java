package exercicios.ex01;

public class ClubeFutebol {
    private String nome;
    private int saldoDeGols;

    public ClubeFutebol() {
        this("Time desconhecido",0);
    }

    public ClubeFutebol(String nome) {
        this(nome,0);
    }

    public ClubeFutebol(int saldoDeGols) {
        this("Time desconhecido", saldoDeGols);
    }

    public ClubeFutebol(String nome, int saldoDeGols) {
        this.nome = nome;
        this.saldoDeGols = saldoDeGols;
    }

    public String getNome() {
        return nome;
    }

    public int getSaldoDeGols() {
        return saldoDeGols;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\n Saldo de gols: %d", this.nome, this.saldoDeGols);
    }

}
