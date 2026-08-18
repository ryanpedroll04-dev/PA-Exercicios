package prj01;
import java.util.Scanner;
public class SomaQuadrado {
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		double v1,v2,v3, soma;
		
		System.out.println("Digite o primeiro valor");
		v1 = leia.nextDouble();
		System.out.println("Digite o segundo valor");
		v2 = leia.nextDouble();
		System.out.println("Digite o terceiro valor");
		v3 = leia.nextDouble();
		soma = v1*v1+v2*v2+v3*v3;
		System.out.println("A soma dos quadrados são:"+soma);
		leia.close(); 
	}
}
