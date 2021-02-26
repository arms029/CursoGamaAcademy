package exercicios.ex04;

public class Relogio {
    private int hora, minuto, segundo;

    public Relogio(int hora, int minuto, int segundo){
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public void exibir(){
        System.out.printf("Hora atual: %02d h %02d m %02d s\n",hora,minuto,segundo);
    }

    public void setHora(int hora) {
        if(hora < 24 && hora > -1)
            this.hora = hora;
        else
            throw new IllegalArgumentException("Hora invalida!, utilize horas na faixa de 0 - 23");
    }

    public void setMinuto(int minuto) {
        if(minuto < 60 && minuto > -1)
            this.minuto = minuto;
        else
            throw new IllegalArgumentException("Minutos inválidos!, utilize minutos na faixa de 0 - 59");
    }

    public void setSegundo(int segundo) {
        if(segundo < 60 && segundo > -1)
            this.segundo = segundo;
        else
            throw new IllegalArgumentException("Segundos inválidos! utilize segundos na faixa de 0 - 59");
    }
}
