package VetoresLista;
import java.util.Scanner;
public class Intersecao {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], b[], c[], i, j, tC, tB, jT, k;
		final int TAM = 10;
		
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
        tC = 0;

        System.out.println("Vetor A:");
        for (i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            a[i] = in.nextInt();
        }
        System.out.println("Vetor B:");
        for (i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            b[i] = in.nextInt();
        }

        for (i = 0; i < 10; i++) {
            tB = 0;
            for (j = 0; j < 10; j++) {
                if (a[i] == b[j]) {
                    tB = 1;
                }
            }
            jT = 0;
            for (k = 0; k < tC; k++) {
                if (a[i] == c[k]) {
                    jT = 1;
                }
            }
            if (tB == 1 && jT == 0) {
                c[tC] = a[i];
                tC++;
            }
        }

        if (tC == 0) {
            System.out.println("Não tem interseção");
        } else {
            System.out.print("Interseção: ");
            for (i = 0; i < tC; i++) {
                System.out.print(c[i] + " ");
            }
            System.out.println();
        }
        in.close();
	}

}
