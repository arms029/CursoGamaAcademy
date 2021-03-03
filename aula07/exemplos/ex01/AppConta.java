package exemplos.ex01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        int numConta;
        double limite;
        double valorDeposito;
        double valorSaque;
        Map<Integer, Conta> listaContas = new HashMap<>();
        ArrayList<Conta> arrayListContas = new ArrayList<>();

        do {
            printarMenu();
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("opção 1 - CONTA CORRENTE");
                    System.out.println("digite o número da conta");
                    numConta = teclado.nextInt();

                    listaContas.put(numConta, new ContaCorrente(numConta));
                    arrayListContas.add(new ContaCorrente(numConta));

                    // criarConta();
                    break;
                case 2:
                    System.out.println("opção 2 - CONTA ESPECIAL");
                    System.out.println("digite o número da conta");
                    numConta = teclado.nextInt();

                    System.out.println("digite o limite da conta");
                    limite = teclado.nextDouble();

                    listaContas.put(numConta, new ContaEspecial(numConta, limite));
                    arrayListContas.add(new ContaEspecial(numConta, limite));

                    // criarConta();
                    break;
                case 3:
                    System.out.println("opção 3 - CONTA POUPANÇA");
                    System.out.println("digite o número da conta");
                    numConta = teclado.nextInt();

                    listaContas.put(numConta, new ContaPoupanca(numConta));
                    arrayListContas.add(new ContaPoupanca(numConta));

                    // criarConta();
                    break;
                case 4:
                    System.out.println("opção 4 - DEPOSITAR");
                    System.out.println("digite o número da conta");
                    numConta = teclado.nextInt();

                    System.out.println("digite o valor do depósito");
                    valorDeposito = teclado.nextDouble();

                    // com Map
                    listaContas.get(numConta).deposita(valorDeposito);

                    // com ArrayList
                    for (Conta conta : arrayListContas) {
                        if (conta.getNumero() == numConta) {
                            conta.deposita(valorDeposito);
                            break;
                        }
                    }

                    // depositar();
                    break;
                case 5:
                    System.out.println("opção 5 - SACAR");
                    System.out.println("digite o número da conta");
                    numConta = teclado.nextInt();

                    System.out.println("digite o valor do saque");
                    valorSaque = teclado.nextDouble();

                    // com Map
                    listaContas.get(numConta).saque(valorSaque);

                    // com ArrayList
                    for (Conta conta : arrayListContas) {
                        if (conta.getNumero() == numConta) {
                            conta.saque(valorSaque);
                            break;
                        }
                    }

                    // sacar();
                    break;
                case 6:
                    System.out.println("opção 6 - VERIFICAR SALDO");
                    System.out.println("digite o número da conta");
                    numConta = teclado.nextInt();

                    // com Map
                    System.out.println(listaContas.get(numConta).getSaldo());

                    // com ArrayList
                    for (Conta conta : arrayListContas) {
                        if (conta.getNumero() == numConta) {
                            System.out.println(conta.getSaldo());
                            break;
                        }
                    }

                    // verificarSaldo();
                    break;
                case 7:
                    System.out.println("opção 7 - ENCERRAR");
                    // encerrar();
                    break;
                case 99:
                    System.out.println("opção 99 - LISTAR CONTAS");
                    for (Conta conta : arrayListContas) {
                        System.out.println(conta);
                    }
                    // listarContas();
                    break;
                default:
                    System.out.println("opção inválida - escolha umas das opções abaixo!");
                    // nenhumaOpcao();
                    break;
            }

        } while (opcao != 7);

        teclado.close();
    }

    private static void printarMenu() {
        System.out.println("\n1-Nova conta corrente");
        System.out.println("2-Nova conta especial");
        System.out.println("3-Nova conta poupança");
        System.out.println("4-Fazer depósito");
        System.out.println("5-Fazer saque");
        System.out.println("6-Verificar o saldo");
        System.out.println("7-Encerrar");
        System.out.println("99-Listar Contas");
        System.out.print("===> ");
    }

    // private static void depositar() {
    // }

    // private static void sacar() {
    // }

    // private static void verificarSaldo() {
    // }

    // private static void encerrar() {
    // }

    // private static void nenhumaOpcao() {
    // }

    // private static Conta criarConta(TipoConta tipo, int numConta) {
    //     if (tipo == TipoConta.CONTA_CORRENTE) {
    //         return new ContaCorrente(numConta);
    //     }
    //     if (tipo == TipoConta.CONTA_POUPANCA) {
    //         return new ContaPoupanca(numConta);
    //     }
    //     if (tipo == TipoConta.CONTA_ESPECIAL) {
    //         return new ContaEspecial(numConta, 0);
    //     }
    //     return null;
    // }

    // private static Conta criarConta(TipoConta tipo, int numConta, double limite) {
    //     if (tipo == TipoConta.CONTA_CORRENTE) {
    //         throw new IllegalArgumentException("Conta corrente não aceita limite como parâmetro");
    //     }
    //     if (tipo == TipoConta.CONTA_POUPANCA) {
    //         throw new IllegalArgumentException("Conta poupança não aceita limite como parâmetro");
    //     }
    //     if (tipo == TipoConta.CONTA_ESPECIAL) {
    //         return new ContaEspecial(numConta, limite);
    //     }
    //     return null;
    // }

}
