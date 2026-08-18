package SwichCase;

import java.util.Scanner;

public class Exericio2 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 int mes;
		 System.out.println("Entre com valor de 1 a 12 como um mês");
		 mes = in.nextInt();
		 switch(mês) {
		 	case 1:
		 	case 3:
		 	case 5:
		 	case 7:
		 	case 8:
		 	case 10:
		 	case 12:
		 		System.out.println("Esses meses possuem 31 dias");
		 		break;
		 	case 4:
		 	case 6:
		 	case 9:
		 	case 11:
		 		System.out.println("Esses meses possuem 30 dias");
		 		break;
		 	case 2:
		 		System.out.println("Esse mês possuem 28 ou 29 dias");
		 		break;
		 	default:
		 		System.out.println("Esse número que você digitou não corresponde a nenhum meses no ano");
		 		
		 }

	}

}
