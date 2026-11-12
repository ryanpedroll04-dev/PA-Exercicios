package VetoresLista;
import java.util.Scanner;
public class InteirosPares {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int a[], j, i;
		final int TAM = 10;
		
		a = new int[TAM];

        for (i = 0; i < 10; i++) {
            System.out.print("numero " + (i + 1) + ": ");
            a[i] = in.nextInt();
        }

        for (i = 0; i < 10; i++) {
            System.out.print("pares de 0 ate " + a[i] + ": ");
            for (j = 0; j <= a[i]; j += 2) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        in.close();
    

	}

}
