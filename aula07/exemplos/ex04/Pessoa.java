package exemplos.ex04;

public class Pessoa {
    private String nome;
    private Endereco endereco;

    public Pessoa() {
        this.nome = "";
        this.endereco = new Endereco("",0);
    }

    public Pessoa(String nome) {
        this.nome = nome;
        this.endereco = new Endereco("",0);
    }

    public Pessoa(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa [endereco=" + endereco + ", nome=" + nome + "]";
    }
    
}
