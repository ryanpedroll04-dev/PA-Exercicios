import java.util.Scanner;
public class Delta {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double a,b,c,delta,raiz1,raiz2;

        System.out.print("Digite o valor de A: ");
        a = leia.nextDouble();

        System.out.print("Digite o valor de B: ");
        b = leia.nextDouble();

        System.out.print("Digite o valor de C: ");
        c = leia.nextDouble();

        delta = (b*b) - (4*a*c);

        System.out.println("Delta = " + delta);

        if (delta<0) {

            System.out.println("Não existem raízes reais.");

        } else if (delta==0) {

            raiz1 = (-b + Math.sqrt(delta))/(2*a);

            System.out.println("Existe apenas uma raiz real.");
            System.out.println("Raiz = " + raiz1);

        } else {

            raiz1 = (-b + Math.sqrt(delta))/(2*a);
            raiz2 = (-b - Math.sqrt(delta))/(2*a);

            System.out.println("Existem duas raízes reais: " + raiz1 + " e " + raiz2);

        }

        leia.close();
    }
}