package exercicios.ex03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        String modelo, marca;
        double consumo;

        File arquivo = new File("exercicios\\ex03\\veiculos.csv");
        Scanner scanner = new Scanner(arquivo);

        //pular header
        scanner.nextLine();
        scanner.useDelimiter("[,\n]");

        while(scanner.hasNext()){
            modelo = scanner.next();
            marca = scanner.next();
            consumo = Double.parseDouble(scanner.next());

            Veiculo veiculo = new Veiculo(modelo,marca,consumo);

            veiculo.info();
            System.out.printf("Consumo: %.2f km/L\n",veiculo.getConsumo());
        }

        scanner.close();
    }
}
