package prj01;
import java.util.Scanner;
public class TrocaValores {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double a,b,c;
		
		System.out.println("Entre com o primeiro valor");
		a = leia.nextDouble();
		System.out.println("Entre com o segundo valor");
		b = leia.nextDouble();
		c = a;
		a = b;
		b = c;
		System.out.println("Valor A:"+a);
		System.out.println("Valor B:"+b);
		leia.close();
		
	}
}
