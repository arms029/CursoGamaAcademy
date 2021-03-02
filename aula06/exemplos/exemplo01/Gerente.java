package exemplos.exemplo01;

public class Gerente extends Funcionario{
    private int numeroFuncionario;

    public Gerente(){
        super();
        this.numeroFuncionario = 0;
    }

    public Gerente(String nome, double salario, int numeroFuncionario){
        super(nome,salario);
        this.numeroFuncionario = numeroFuncionario;
    }

	public void setNumeroFuncionario(int numeroFuncionario) {
        this.numeroFuncionario = numeroFuncionario;
    }

    public int getNumeroFuncionario() {
        return numeroFuncionario;
    }

    @Override
    public String exibir(){
        return super.exibir() + String.format("\nnumero de funcionários: %d", this.numeroFuncionario);
    }

    @Override
    public String toString() {
        return super.toString() + "," + numeroFuncionario;
    }

    @Override
    public void aumentoSalarial(double taxaAumento){
        super.aumentoSalarial(taxaAumento + 10d);
    }
}
