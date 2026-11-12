import java.util.Scanner;
public class AnoBissexto {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i, n, anoInicial, anoFim, bissexto;
		
		System.out.println("Informe o ano inicial :");
		anoInicial = ler.nextInt();
		System.out.println("Informe o ano Final");
		anoFim = ler.nextInt();
		
		
		n = anoInicial-anoFim;
		
		bissexto = n/4;
		
		for (i=1; i<n; i++) {
			
			System.out.println("Os anos bissexto serão: " + bissexto);
		}
		
	}
}
