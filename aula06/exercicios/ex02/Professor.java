package exercicios.ex02;

public class Professor extends Pessoa {
    private double salario;

    public Professor(String nome, String telefone, double salario) {
        super(nome,telefone);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
    
    public void ensinar(){
        System.out.println("ensinando");
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.salario;
    }
}
