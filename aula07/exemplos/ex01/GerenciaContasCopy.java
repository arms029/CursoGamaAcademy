package exemplos.ex01;

import java.util.ArrayList;

public class GerenciaContasCopy {
    private ArrayList<Conta> listaContas;
    
    public GerenciaContasCopy() {
        listaContas = new ArrayList<>();
    }

    public void novaContaCorrente(int numeroConta){
        listaContas.add(new ContaCorrente(numeroConta));
    }
    public void novaContaPoupanca(int numeroConta){
        listaContas.add(new ContaPoupanca(numeroConta));
    }
    public void novaContaEspecial(int numeroConta, double limite){
        listaContas.add(new ContaEspecial(numeroConta,limite));
    }

    public boolean deposito(int numeroConta, double valor){
        for (Conta conta : listaContas) 
            if (conta.getNumero() == numeroConta)
                return conta.deposita(valor);
        return false; //não achou a conta
    }

    public boolean saque(int numeroConta, double valor){
        for (Conta conta : listaContas) 
            if (conta.getNumero() == numeroConta)
                return conta.saque(valor);
        return false; //não achou a conta
    }

    public String exibirSaldo(int numeroConta){
        for (Conta conta : listaContas) 
            if (conta.getNumero() == numeroConta)
                return conta.toString();
        return "conta não encontrada"; //não achou a conta
    }

}
