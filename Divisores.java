package VetoresLista;
import java.util.Scanner;
public class Divisores {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], n, i, d;
		final int TAM = 10;
		
		a = new int[TAM];
		
        for (i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            a[i] = in.nextInt();
        }

        for (i = 0; i < 10; i++) {
            n = a[i];
            if (n < 0) {
                n = -n;
            }
            if (n == 0) {
                System.out.println("0 tem divisores infinitos");
            } else {
                System.out.print("Divisores de " + a[i] + ": ");
                for (d = 1; d <= n; d++) {
                    if (n % d == 0) {
                        System.out.print(d + " ");
                    }
                }
                System.out.println();
            }
        }
        in.close();
    }


	}

