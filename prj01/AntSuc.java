package prj01;
import java.util.Scanner;
public class AntSuc {
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		double n, ant, suc;
		
		System.out.println("Digite o número.");
		n = leia.nextDouble();
		suc = n+1;
		ant = n-1;
		System.out.println("O antecessor desse número é:"+ant);
		System.out.println("O sucessor desse número é:"+suc);
		leia.close();
		
		
	}
}
