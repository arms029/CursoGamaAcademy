package exercicios;

public class Extra02 {
    public static void main(String[] args) {
        //while encadeado
        int i=0;
        while(i < 4){
            int j=0;
            while(j < 3){
                System.out.printf("[%d,%d] ",i,j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
