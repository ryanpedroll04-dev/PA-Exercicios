package prj01;
import java.util.Scanner;
public class AnoNasc {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int anoNasc, anoAtual, idade;
		
		System.out.println("Escreva seu ano de nascimento.");
		anoNasc = leia.nextInt();
		System.out.println("Escreva o ano atual");
		anoAtual = leia.nextInt();
		idade = anoAtual-anoNasc;
		System.out.println("Sua idade é:"+idade);
		leia.close();
	}

}
