package prj02;
import java.util.Scanner;
public class EuroReal {
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		double euro, real, cotacao;
		
		System.out.println("Digite o valor em Euros:");
		euro = leia.nextDouble();
		System.out.println("Digite o valor da cotação do Euro:");
		cotacao = leia.nextDouble();
		real = euro*cotacao;
		System.out.println("O valor em reais é:"+real);
		leia.close();
	}
}
