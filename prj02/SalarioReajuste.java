package prj02;
import java.util.Scanner;
public class SalarioReajuste {
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		double salario,novoSal, reajuste;
		
		System.out.println("Digite seu salário:");
		salario = leia.nextDouble();
		reajuste = salario/100*10;
		novoSal = salario+reajuste;
		System.out.println("Seu salário com o reajuste aplicado é:"+novoSal);
		leia.close();
	}
}
