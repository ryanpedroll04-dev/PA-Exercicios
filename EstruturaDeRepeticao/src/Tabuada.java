import java.util.Scanner;
public class Tabuada {
			public static void main(String[] args) {
				Scanner ler = new Scanner (System.in);
				int i=1, n, r;
				System.out.println("digite um numero e veja a tabuada dele: ");
				n = ler.nextInt();
				while(i<11) {
					r = n*i;
					System.out.println(n+ "X" +i+"="+r);
					i++;
				}
			}
}
