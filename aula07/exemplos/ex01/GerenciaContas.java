package exemplos.ex01;

import java.util.HashMap;

public class GerenciaContas {
    private HashMap<Integer, Conta> listaContas;

    public GerenciaContas() {
        listaContas = new HashMap<>();
    }

    public void novaContaCorrente(int numeroConta) {
        listaContas.put(numeroConta, new ContaCorrente(numeroConta));
    }

    public void novaContaPoupanca(int numeroConta) {
        listaContas.put(numeroConta, new ContaPoupanca(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite) {
        listaContas.put(numeroConta, new ContaEspecial(numeroConta, limite));
    }

    public boolean deposito(int numeroConta, double valor) {
        Conta conta = listaContas.get(numeroConta);
        if(conta != null)
            return conta.deposita(valor);
        else
            return false;
    }

    public boolean saque(int numeroConta, double valor) {
        Conta conta = listaContas.get(numeroConta);
        if(conta != null)
            return conta.saque(valor);
        else
            return false;
    }

    public String exibirSaldo(int numeroConta) {
        Conta conta = listaContas.get(numeroConta);
        if(conta != null)
            return conta.toString();
        else
            return String.format("A conta %d não foi encontrada", numeroConta);
    }

}
