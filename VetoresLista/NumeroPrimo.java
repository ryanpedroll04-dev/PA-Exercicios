package VetoresLista;
import java.util.Scanner;
public class NumeroPrimo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int a[], i, cont, d;
		final int TAM = 10;
		
		a = new int[TAM];

        for (i = 0; i < 10; i++) {
            System.out.print("numero " + (i + 1) + ": ");
            a[i] = in.nextInt();
        }

        for (i = 0; i < 10; i++) {
            cont = 0;
            for (d = 1; d <= a[i]; d++) {
                if (a[i] % d == 0) {
                    cont++;
                }
            }
            if (cont == 2) {
                System.out.println(a[i] + "Primo");
            } else {
                System.out.println(a[i] + "Nao primo");
            }
        }
        in.close();
    }


	}


