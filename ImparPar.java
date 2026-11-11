package VetoresLista;

import java.util.Scanner;

public class ImparPar {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int a[], b[], i, p, im;
		final int TAM = 20;
		
		p = 0;
		im = 0;
		a = new int[TAM];
		b = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Escreva o " +(i+1)+ "o número: ");
			a[i] = in.nextInt();
			
		}
		
		for(i=0; i<TAM; i++) {
			if (a[i] % 2 == 0) {
				b[p] = a[i];
				p++;
			}
		}
		
		im = p;
		
		for(i=0; i<TAM; i++) {
			if  (a[i] % 2 != 0){
				b[im] = a[i];
				im++;
			}
		}
		
		System.out.print("b[");
		
		for(i=0; i<TAM; i++) {
			System.out.print(b[i]+", ");
		}
		System.out.print("]");
		 
	}
		
		
	
}
	


