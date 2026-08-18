package SwichCase;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int d;
		
		System.out.println("Entre com números entre 1 e 5 que represetam os dias de segunda a sexta para informar o dia em que o rodizio de carros pega sua placa");
		d = in.nextInt();
		
		switch(d) {
			case 1:
				System.out.println("Segunda-Feira: finais das placas 1 e 2!");
				break;
			case 2:
				System.out.println("Terça-Feira: finais das placas 3 e 4!");
				break;
			case 3:
				System.out.println("Quarta-feira: finais das placas 5 e 6!");
				break;
			case 4:
				System.out.println("Quinta-feira: finais das placas 7 e 8!");
				break;
			case 5:
				System.out.println("Sexta-feira: finais das placas 9 e 0!");
				break;
			default:
				System.out.println("Esta livre para circular com seu carro");
		}
	}

}
