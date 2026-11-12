package For;
import java.util.Scanner;
public class AnoBissexto {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i, n, anoInicial, anoFim, bissexto;
		
		System.out.println("Informe o ano inicial :");
		anoInicial = in.nextInt();
		System.out.println("Informe o ano Final");
		anoFim = in.nextInt();
		
		
		n = anoInicial-anoFim;
		
		bissexto = n/4;
		
		for (i=1; i<n; i++) {
			
			System.out.println("Os anos bissexto serão: " + bissexto);
		}
		
	}
}
