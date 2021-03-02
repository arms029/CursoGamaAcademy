package exemplos.exemplo01;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario() {
        this.nome = "N/A";
        this.salario = 0d;
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public String exibir(){
        return String.format("Nome: %s\nSalario: R$%.2f", this.nome,this.salario);
    }

    @Override
    public String toString() {
        return this.nome + "," + this.salario;
    }

    public void aumentoSalarial(double taxaAumento){
        this.salario += (salario * taxaAumento / 100d);
    }
}
