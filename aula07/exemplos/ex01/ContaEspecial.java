package exemplos.ex01;

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numero, double limite) {
        super(numero);
        this.limite = limite;
    }

    @Override
    public boolean deposita(double valor){
        return super.deposita(valor);
    }

    @Override
    public boolean saque(double valor){
        if(valor <= getSaldo() + this.limite)
            return super.saque(valor);
        else
            return false;
    }

    @Override
    public String toString() {
        return String.format("\nConta Especial") + super.toString() + String.format("\nLimite: %.2f",this.limite);
    }
}
