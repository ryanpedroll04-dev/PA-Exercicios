package prj01;
import java.util.Scanner;
public class Ipva {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double valorCarro, ipva;
		
		System.out.println("Digite o valor do carro");
		valorCarro = leia.nextDouble();
		ipva = valorCarro/100*4;
		System.out.println("O valor do IPVA é:"+ipva);
		leia.close();
	}
}
