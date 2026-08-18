package prj01;
import java.util.Scanner;
public class DiaMesAno {
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int dia, mes, ano;
		
		System.out.println("Coloque o dia.");
		dia = leia.nextInt();
		mes = dia/30;
		ano = dia/365;
		System.out.println("A conversao de dias para meses ficou:"+mes);
		System.out.println("A conversao de dias para anos ficou:"+ano);
		leia.close();
	}
}
