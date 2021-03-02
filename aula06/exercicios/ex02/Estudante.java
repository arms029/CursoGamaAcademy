package exercicios.ex02;

public class Estudante extends Pessoa{
    private String curso;

    public Estudante(String nome, String telefone, String curso) {
        super(nome,telefone);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }
    
    public void estudar(){
        System.out.println("estudando");
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.curso;
    }

}
