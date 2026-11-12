package VetoresLista;
import java.util.Scanner;
public class Palindromo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A[],i, p;
        final int TAM = 10;

        A = new int[TAM];
        p = 1;

        for (i = 0; i < TAM; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            A[i] = in.nextInt();
        }

        for (i = 0; i < 5; i++) {
            if (A[i] != A[9 - i]) {
               p = 0;
            }
        }

        if (p == 1) {
            System.out.println("O vetor e um palindromo!");
        } else {
            System.out.println("O vetor nao e um palindromo!");
        }

        in.close();
    }
}