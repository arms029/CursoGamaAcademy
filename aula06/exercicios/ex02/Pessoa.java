package exercicios.ex02;
public abstract class Pessoa {
    private String nome;
    private String telefone;

    public Pessoa(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return this.nome + "," + this.telefone;
    }
}
