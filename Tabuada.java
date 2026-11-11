package VetoresLista;
import java.util.Scanner;
public class Tabuada {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], i, j;
		final int TAM = 5;
		
		a = new int[TAM];

        for (i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            a[i] = in.nextInt();
        }

        for (i = 0; i < 5; i++) {
            System.out.println("Tabuada do " + a[i] + ":");
            for (j = 1; j <= 10; j++) {
                System.out.println(a[i] + " x " + j + " = " + (a[i] * j));
            }
            System.out.println();
        }
        in.close();
    }
}




