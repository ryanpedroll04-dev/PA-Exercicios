package VetoresLista;
import java.util.Scanner;
public class FatorialElemento {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], b[], fat, i, j;
		final int TAM = 15;
		
		a = new int[TAM];
		b = new int[TAM];

        for (i = 0; i < 15; i++) {
            System.out.print("numero " + (i + 1) + " (0 a 12): ");
            a[i] = in.nextInt();
            while (a[i] < 0 || a[i] > 12) {
                System.out.print("Valor invalido (0 a 12): ");
                a[i] = in.nextInt();
            }
        }

        for (i = 0; i < 15; i++) {
            fat = 1;
            for (j = 2; j <= a[i]; j++) {
                fat = fat * j;
            }
            b[i] = fat;
        }

        for (i = 0; i < 15; i++) {
            System.out.println(a[i] + "! = " + b[i]);
        }
        in.close();
	}

}
