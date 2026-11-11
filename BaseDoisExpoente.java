package VetoresLista;
import java.util.Scanner;
public class BaseDoisExpoente {
	public static void main(String[] args) {
		int a[], pot, i, d;
		final int TAM = 11;
		
		a = new int[TAM];

        for (i = 0; i <= 10; i++) {
            pot = 1;
            for (d = 0; d < i; d++) {
                pot = pot * 2;
            }
            a[i] = pot;
        }

        for (i = 0; i <= 10; i++) {
            System.out.println("A[" + i + "] = 2^" + i + " = " + a[i]);
        }

	}

}
