package exercicios.ex02;

public class App {
    public static void main(String[] args) {
        // Pessoa pessoa = new Pessoa("Jorge","12345678");
        Estudante estudante = new Estudante("Mateus","6665434","Curso de estatística");
        Professor professor = new Professor("Paulo","1231234343",2000.00d);

        estudante.estudar();
        professor.ensinar();

        // System.out.println(pessoa);
        System.out.println(estudante);
        System.out.println(professor);
    }
}
