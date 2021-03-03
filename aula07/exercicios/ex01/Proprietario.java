package exercicios.ex01;

public class Proprietario {
    private String nome;
    private String phone;

    public Proprietario(String nome, String phone) {
        this.nome = nome;
        this.phone = phone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "\nnome: " + nome + "\nphone=" + phone;
    }

    
}
