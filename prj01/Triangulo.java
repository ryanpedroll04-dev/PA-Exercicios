package prj01;
import java.util.Scanner;
public class Triangulo {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double base, alt, res, area;
		
		System.out.println("Entre com a base do triângulo");
		base = leia.nextDouble();
		System.out.println("Entre com a altura do triângulo");
		alt = leia.nextDouble();
		res = base*alt;
		area = res/2;
		System.out.println("A área do triângulo é:"+area);
		leia.close();
		
		
	}
}
