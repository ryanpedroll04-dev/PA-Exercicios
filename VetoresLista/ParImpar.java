package VetoresLista;
import java.util.Scanner;
public class ParImpar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A[], B[], i;
        final int TAM = 10;

        A = new int[TAM];
        B = new int[TAM];

        for (i = 0; i < TAM; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            A[i] = in.nextInt();
        }

        for (i = 0; i < TAM; i++) {
            if (A[i] % 2 == 0) {
                B[i] = 1;
            } else {
                B[i] = 0;
            }
        }

        System.out.println("Vetor B:");

        for (i = 0; i < TAM; i++) {
            System.out.println(B[i]);
        }

        in.close();
    }
}