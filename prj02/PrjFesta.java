package prj02;
import java.util.Scanner;
public class PrjFesta {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int homem, mulher, salg, doce;
		double bolo, bebida;
		
		System.out.println("Escreva a quantidade de homens:");
		homem = leia.nextInt();
		System.out.println("Escreva a quantidade de mulheres:");
		mulher = leia.nextInt();
		salg = (homem*15)+(mulher*10);
		doce = (homem*6)+(mulher*8);
		//Passei os bolos de gramas para quilogramas, e as bebidas passei de mililitros para litros.
		//100g=0,1kg. 600ml=0,6L e 500ml=0,5L.
		bolo = (homem+mulher)*0.1;
		bebida = (homem*0.6)+(mulher*0.5);
		System.out.println("A quantida necessária de salgados é:"+salg);
		System.out.println("A quantidade necessária de doces é:"+doce);
		System.out.println("A quantidade necessária de bolo em quilogramas é:"+bolo);
		System.out.println("A quantidade necessária de bebida em litros é:"+bebida);
		leia.close();
	}
}
