package VetoresLista;
import java.util.Scanner;
public class DiferencaConjuntos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A[], B[], C[], i, j, k, qtd, exst;
        final int TAM = 10;

        A = new int[TAM];
        B = new int[TAM];
        C = new int[TAM];
        qtd = 0;

        for (i = 0; i < TAM; i++) {
            System.out.print("Numero A " + (i + 1) + ": ");
            A[i] = in.nextInt();
        }

        for (i = 0; i < TAM; i++) {
            System.out.print("Numero B " + (i + 1) + ": ");
            B[i] = in.nextInt();
        }

        for (i = 0; i < TAM; i++) {
        	exst = 0;

            for (j = 0; j < TAM; j++) {
                if (A[i] == B[j]) {
                	exst = 1;
                }
            }

            for (k = 0; k < qtd; k++) {
                if (A[i] == C[k]) {
                	exst = 1;
                }
            }

            if (exst == 0) {
                C[qtd] = A[i];
                qtd++;
            }
        }

        System.out.println("Elementos de C:");

        for (i = 0; i < qtd; i++) {
            System.out.println(C[i]);
        }

        in.close();
    }
}