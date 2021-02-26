package exercicios;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int QTDE_TURMAS = 5, QTDE_ALUNOS = 2;
        double media, mediaTurma, mediaGeral = 0;
        
        for (int i = 0; i < QTDE_TURMAS; i++) {
            mediaTurma = 0;
            System.out.println();
            for (int j = 0; j < QTDE_ALUNOS; j++) {
                System.out.println("Digite a média para o aluno " + (j + 1));
                media = teclado.nextDouble();
                mediaTurma += media;
                System.out.printf("Turma %d\nAluno %d --- média: %.1f\n",(i+1),(j+1),media);
            }
            mediaTurma /= QTDE_ALUNOS;
            mediaGeral += mediaTurma;
            System.out.println("*----------------------------*");
            System.out.printf("|  Turma %d média turma: %.1f  |\n",(i+1),(mediaTurma));
            System.out.println("*----------------------------*");
        }
        mediaGeral /= QTDE_TURMAS;

        System.out.println("*---------------------------*");
        System.out.printf("|  Turmas média geral: %.1f  |\n",(mediaGeral));
        System.out.println("*---------------------------*");

        teclado.close();
    }
}
