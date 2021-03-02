package exercicios.ex03;

public class ContaPoupanca extends Conta {
    private static double taxaSaque = 0; //atributo de classe

    public ContaPoupanca(int numero) {
        super(numero);
    }

    public static double getTaxaSaque() {
        return ContaPoupanca.taxaSaque;
    }

    public static void setTaxaSaque(double taxaSaque) {
        ContaPoupanca.taxaSaque = taxaSaque;
    }

    @Override
    public boolean deposita(double valor){
        return super.deposita(valor);
    }

    @Override   //taxaOperação
    public boolean saque(double valor){
        if(valor + ContaPoupanca.taxaSaque <= getSaldo())
            return super.saque(valor + ContaPoupanca.taxaSaque);
        else
            return false;
    }

    @Override
    public String toString() {
        return String.format("\nConta Poupança") + super.toString() + String.format("\nTaxa operação saque: %.2f", ContaPoupanca.taxaSaque);
    }
}
