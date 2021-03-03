package exemplos.ex04;

public class Endereco {
    private String logradouro;
    private int numero;

    public Endereco(){
        
    }

    public Endereco(String logradouro, int numero) {
        this.logradouro = logradouro;
        this.numero = numero;
    }
    
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereco [logradouro=" + logradouro + ", numero=" + numero + "]";
    }


}
