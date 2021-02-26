package exercicios.ex03;

public class Veiculo {
    private String modelo;
    private String marca;
    private double consumo;

    public Veiculo(String modelo, String marca, double consumo){
        if(consumo < 0)
            throw new IllegalArgumentException("O consumo não pode ser negativo!");
        this.modelo = modelo;
        this.marca = marca;
        setConsumo(consumo);
    }

    public void info(){
        System.out.printf("Modelo: %s\nMarca: %s\n",modelo,marca);
    }

    public double getConsumo() {
        return this.consumo;
    }

    public void setConsumo(double consumo) {
        if(consumo >= 0)
            this.consumo = consumo;
        throw new IllegalArgumentException("o consumo não pode ser negativo!");
    }

}
