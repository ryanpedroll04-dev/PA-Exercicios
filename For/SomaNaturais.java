package For;
import java.util.Scanner;
public class SomaNaturais {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, numero, soma, i;

        soma = 0;

        System.out.print("Quantos numeros deseja digitar? ");
        n = in.nextInt();

        for (i = 0; i < n; i++) {
            System.out.print("Digite um numero natural: ");
            numero = in.nextInt();
            soma = soma + numero;
        }

        System.out.println("A soma dos numeros e: " + soma);

        in.close();
    }
}