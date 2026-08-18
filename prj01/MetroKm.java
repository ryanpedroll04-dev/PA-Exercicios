package prj01;
import java.util.Scanner;
public class MetroKm {
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		double m,km;
		
		System.out.println("Digite o valor em metros:");
		m = leia.nextDouble();
		km = m/1000;
		System.out.println("O valor em KM é:"+km);
		leia.close();
		
		
		
	}

}
