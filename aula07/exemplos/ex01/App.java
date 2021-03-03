package exemplos.ex01;

public class App {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(12345678);
        ContaPoupanca cp = new ContaPoupanca(12345678);
        ContaPoupanca.setTaxaSaque(0.10);
        ContaEspecial ce = new ContaEspecial(12345678,1000.00d);
        double valorSaque = 0d;

        cc.deposita(500d);
        cc.saque(499.90);
        // cc.saque(500d);

        System.out.println(cc);


        // valorSaque = 500d;
        // if(!cc.saque(valorSaque)){
        //     System.out.println("\nSaque NÃO PERMITIDO!, valor: " + valorSaque);
        //     System.out.println(cc);
        //     System.out.printf("Valor de saque negado: %.2f\n",valorSaque);
        // }
        // else{
        //     System.out.println(cc);
        //     System.out.printf("Valor sacado: %.2f\n",valorSaque);
        // }

        // valorSaque = 500d;
        // if(!cp.saque(valorSaque)){
        //     System.out.println("\nSaque NÃO PERMITIDO!, valor: " + valorSaque);
        //     System.out.println(cp);
        //     System.out.printf("Valor de saque negado: %.2f\n",valorSaque);
        // }
        // else{
        //     System.out.println(cp);
        //     System.out.printf("Valor sacado: %.2f\n",valorSaque);
        // }

        // valorSaque = 1500d;
        // if(!ce.saque(valorSaque)){
        //     System.out.println("\nSaque NÃO PERMITIDO!, valor: " + valorSaque);
        //     System.out.println(ce);
        //     System.out.printf("Valor de saque negado: %.2f\n",valorSaque);
        // }
        // else{
        //     System.out.println(ce);
        //     System.out.printf("Valor sacado: %.2f\n",valorSaque);
        // }

    }


    
}
