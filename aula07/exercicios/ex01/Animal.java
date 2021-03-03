package exercicios.ex01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Animal {
    private String nome;
    private String raca;
    private LocalDate dataNascimento;
    private Proprietario proprietario;

    public Animal(String nome, String raca, LocalDate dataNascimento) {
        this.nome = nome;
        this.raca = raca;
        this.dataNascimento = dataNascimento;
        this.proprietario = new Proprietario("", "");
    }
    
    public Animal(String nome, String raca, LocalDate dataNascimento, Proprietario proprietario) {
        this.nome = nome;
        this.raca = raca;
        this.dataNascimento = dataNascimento;
        this.proprietario = proprietario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "dataNascimento: " + dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\nnome: " 
            + nome + "\nproprietario --> " + proprietario + "\nraca: " + raca;
    }

}
