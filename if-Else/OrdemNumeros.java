import java.util.Scanner;
public class OrdemNumeros {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Entre com o primeiro valor: ");
		a = leia.nextInt();
		System.out.println("Entre com o segundo valor: ");
		b = leia.nextInt();
		System.out.println("Entre com o terceiro valor: ");
		c = leia.nextInt();
		
		if (a<=b && b<=c) {
		    System.out.println("Sua ordem é: " + a + " " + b + " " + c);
		    
		}
		else if (a<=c && c<=b) {
		    System.out.println("Sua ordem é: " + a + " " + c + " " + b);
		    
		}
		else if (b<=a && a<=c) {
		    System.out.println("Sua ordem é: " + b + " " + a + " " + c);
		    
		}
		else if (b<=c && c<=a) {
		    System.out.println("Sua ordem é: " + b + " " + c + " " + a);
		    
		}
		else if (c<=a && a<=b) {
		    System.out.println("Sua ordem é: " + c + " " + a + " " + b);
		    
		}
		else {
		    System.out.println("Sua ordem é: " + c + " " + b + " " + a);
		    
		}
		
		leia.close();
	}

}
