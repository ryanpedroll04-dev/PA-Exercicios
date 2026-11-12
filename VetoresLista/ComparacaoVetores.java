package VetoresLista;
import java.util.Scanner;
public class ComparacaoVetores {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A[], B[], C[], i;
        final int TAM = 10;

        A = new int[TAM];
        B = new int[TAM];
        C = new int[TAM];

        for (i = 0; i < TAM; i++) {
            System.out.print("Numero A " + (i + 1) + ": ");
            A[i] = in.nextInt();
        }

        for (i = 0; i < TAM; i++) {
            System.out.print("Numero B " + (i + 1) + ": ");
            B[i] = in.nextInt();
        }

        for (i = 0; i < TAM; i++) {
            if (A[i] > B[i]) {
                C[i] = 1;
            } else if (A[i] == B[i]) {
                C[i] = 0;
            } else {
                C[i] = -1;
            }
        }

        System.out.println("Vetor C:");

        for (i = 0; i < TAM; i++) {
            System.out.println(C[i]);
        }

        in.close();
    }
}