package exemplos.ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        int numeroConta;
        double limite;
        double valorDeposito;
        double valorSaque;
        ArrayList<Conta> arrayListContas = new ArrayList<>();
        GerenciaContas contas = new GerenciaContas();

        do {
            printarMenu();
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("opção 1 - CONTA CORRENTE");
                    System.out.println("digite o número da conta");
                    numeroConta = teclado.nextInt();

                    contas.novaContaCorrente(numeroConta);
                    break;
                case 2:
                    System.out.println("opção 2 - CONTA ESPECIAL");
                    System.out.println("digite o número da conta");
                    numeroConta = teclado.nextInt();

                    System.out.println("digite o limite da conta");
                    limite = teclado.nextDouble();

                    contas.novaContaEspecial(numeroConta, limite);
                    break;
                case 3:
                    System.out.println("opção 3 - CONTA POUPANÇA");
                    System.out.println("digite o número da conta");
                    numeroConta = teclado.nextInt();

                    contas.novaContaPoupanca(numeroConta);
                    break;
                case 4:
                    System.out.println("opção 4 - DEPOSITAR");
                    System.out.println("digite o número da conta");
                    numeroConta = teclado.nextInt();

                    System.out.println("digite o valor do depósito");
                    valorDeposito = teclado.nextDouble();

                    contas.deposito(numeroConta, valorDeposito);
                    break;
                case 5:
                    System.out.println("opção 5 - SACAR");
                    System.out.println("digite o número da conta");
                    numeroConta = teclado.nextInt();

                    System.out.println("digite o valor do saque");
                    valorSaque = teclado.nextDouble();

                    contas.saque(numeroConta, valorSaque);
                    break;
                case 6:
                    System.out.println("opção 6 - VERIFICAR SALDO");
                    System.out.println("digite o número da conta");
                    numeroConta = teclado.nextInt();

                    System.out.println(contas.exibirSaldo(numeroConta));
                    break;
                case 7:
                    System.out.println("opção 7 - ENCERRAR");
                    break;
                case 99:
                    System.out.println("opção 99 - LISTAR CONTAS");
                    for (Conta conta : arrayListContas) {
                        System.out.println(conta);
                    }
                    break;
                default:
                    System.out.println("opção inválida - escolha umas das opções abaixo!");
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

}
