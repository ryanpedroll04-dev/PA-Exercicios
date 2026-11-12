package For;
import java.util.Scanner;
public class ValorIMC {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in); 
		double peso, alt, imc, i;
		
		for (i=1; i<16; i++) {
			System.out.println("Indique seu peso: ");
			peso = in.nextDouble();
			System.out.println("Indique sua altura: ");
			alt = in.nextDouble();
			
			imc = peso/(alt*alt);
			
			if (imc<22) {
				System.out.println("Magreza");
			}
			else if (imc<28) {
				System.out.println("Normal");
			}
			
			else if (imc<30) {
				System.out.println("Acima do peso");
			}
			
			else {
				System.out.println("Obeso");
			}
			
			System.out.println("voce esta na pessoa: " + i);
			
			
		}
	}

}
