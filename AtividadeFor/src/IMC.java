import java.util.Scanner;
public class IMC {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double i, imc, alt, peso;
		int PesoB=0, PesoN=0, PesoS=0,PesoO=0;
		
		for (i=1;i<16; i++) {
			
			System.out.println("Escreva sua altura: ");
			alt = ler.nextDouble();
			System.out.println("Escreva seu peso: ");
			peso = ler.nextDouble();
			
			imc = peso/(alt*alt);
			
			if (imc<22) {
				PesoB++;
				System.out.println("Baixo peso");
			}
			
			else if (imc<27) {
				PesoN++;
				System.out.println("Normal");
			}
			
			else if (imc<30) {
				PesoS++;
				System.out.println("Sobrepeso");
			}
			
			else {
				PesoO++;
				System.out.println("Obeso");
			}
			System.out.println("Você esta na pessoa: " + i);	
		}
		System.out.println("Tem um total de " + PesoB + " com IMC baixo");
		System.out.println("Tem um total de " + PesoN + " com IMC normal");
		System.out.println("Tem um total de " + PesoS + " com IMC sobrepeso");
		System.out.println("Tem um total de " + PesoO + " com IMC obeso");
	}

}
