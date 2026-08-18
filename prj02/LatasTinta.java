package prj02;
import java.util.Scanner;
public class LatasTinta {
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		double compr,larg, area, latas;
		
		System.out.println("Escreva o comprimento da parede:");
		compr = leia.nextDouble();
		System.out.println("Escreva a largura da parede:");
		larg = leia.nextDouble();
		area = compr*larg;
		latas = area/3.8;
		System.out.println("A quantidade de latas de tinta necessárias é:"+latas);
		leia.close();
	}

}
