package exemplos.ex03;

public class Pessoa {
    String nome;
    int idade;
    double salario;

    Pessoa(String nome, int idade, double salario){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    void apresentar(){
        System.out.println("Olá, eu me chamo " + nome + " e meu salário é " + salario);
    }

}
