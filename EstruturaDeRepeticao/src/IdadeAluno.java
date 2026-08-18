import java.util.Scanner;
public class IdadeAluno {
	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		int ida, nasc, atual;
		int i = 1;
		
		
		while (i<7) {
			
			
			System.out.println("Coloque seu ano de nascimento");
			nasc=Ler.nextInt();
			System.out.println("Coloque o ano atual");
			atual=Ler.nextInt();
			ida=atual-nasc;
			System.out.println("Sua idade é "+ida);
			if (ida<18) {
				System.out.println("Você é menor de idade");
		}
		else {
			System.out.println("Você é maior de idade");
	}
		i++;
}}}
