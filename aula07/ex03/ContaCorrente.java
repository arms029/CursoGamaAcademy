package ex03;

public class ContaCorrente extends Conta{
    private final double TAXA_DEPOSITO = 0.10d;

    public ContaCorrente(int numero) {
        super(numero);
    }

    @Override
    public boolean deposita(double valor){
        valor -= TAXA_DEPOSITO;
        return super.deposita(valor);
    }

    @Override
    public boolean saque(double valor){
        if(valor <= getSaldo())
            return super.saque(valor);
        else
            return false;
    }

    @Override
    public String toString() {
        return String.format("\nConta Corrente") + super.toString() + String.format("\nTaxa operação depósito: %.2f",this.TAXA_DEPOSITO);
    }

}
