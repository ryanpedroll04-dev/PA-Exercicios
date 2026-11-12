import java.util.Scanner;
public class IRPF {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double salario, irpf;

        System.out.print("Digite o salário: R$ ");
        salario = leia.nextDouble();

        if (salario<=1434.59) {

            irpf = 0;
            System.out.println("Isento de imposto");

        } else if (salario<=2150.00) {

            irpf = salario*7.5/100-107.59;
            System.out.println("IRPF: R$ " + irpf);

        } else if (salario<=2866.70) {

            irpf = salario*15/100-268.84;
            System.out.println("IRPF: R$ " + irpf);

        } else if (salario<=3582.00) {

            irpf = salario*22.5/100-483.84;
            System.out.println("IRPF: R$ " + irpf);

        } else {

            irpf = salario*27.5/100-662.94;
            System.out.println("IRPF: R$ " + irpf);

        }

        leia.close();
    }
}