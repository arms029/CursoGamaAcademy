package exemplos.ex01;
public abstract class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero) {
        this.numero = numero;
        this.saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean deposita(double valor){
        if (valor > 0){
            this.saldo += valor;
            return true;
        }
        else
            return false;
    }

    public boolean saque(double valor){
        if (valor < 0)
            return false;

        this.saldo -= valor;
        return true;
    }

    @Override
    public String toString() {
        return String.format("\nNumero conta: %d\nSaldo: %.2f" ,this.numero,this.saldo);
    }
}
