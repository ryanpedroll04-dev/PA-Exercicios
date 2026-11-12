import java.util.Scanner;
public class ValorIMC {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in); 
		double peso, alt, imc, i;
		
		for (i=1; i<16; i++) {
			System.out.println("Indique seu peso: ");
			peso = ler.nextDouble();
			System.out.println("Indique sua altura: ");
			alt = ler.nextDouble();
			
			imc = peso/(alt*alt);
			
			if (imc<22) {
				System.out.println("Magro ingual o kauê");
			}
			else if (imc<28) {
				System.out.println("Magrão do pauzao");
			}
			
			else if (imc<30) {
				System.out.println("Gordinho do pintinho");
			}
			
			else {
				System.out.println("Gabriel");
			}
			
			System.out.println("voce esta na pessoa: " + i);
			
			
		}
	}

}
