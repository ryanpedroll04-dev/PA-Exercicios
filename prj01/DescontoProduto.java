package prj01;
import java.util.Scanner;
public class DescontoProduto {
	public static void main (String[] args){
		Scanner leia = new Scanner(System.in);
		double valorInicial, pd, precoFinal, desc;
		
		System.out.println("Entre com o valor inicial.");
		valorInicial = leia.nextDouble();
		System.out.println("Entre com o valor do desconto.");
		pd = leia.nextDouble();
		desc = valorInicial/100*pd;
		precoFinal = valorInicial-desc;
		System.out.println("O valor com desconto é:"+precoFinal);
		leia.close();
		
	}
}
