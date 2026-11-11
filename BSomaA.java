package VetoresLista;
import java.util.Scanner;
public class BSomaA {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 int a[], b[], soma, i, j;
			final int TAM = 10;
			
			a = new int[TAM];
			b = new int[TAM];
			
	        for (i = 0; i < 10; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            a[i] = in.nextInt();
	        }

	        for (i = 0; i < 10; i++) {
	            soma = 0;
	            for (j = i; j < 10; j++) {
	                soma = soma + a[j];
	            }
	            b[i] = soma;
	        }

	        for (i = 0; i < 10; i++) {
	            System.out.println("B[" + i + "] = " + b[i]);
	        }
	        in.close();

	}

}
