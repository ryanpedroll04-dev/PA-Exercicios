import java.util.Scanner;
public class NotaAluno {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double nota1, nota2, media, notaExame, novaMedia;

        System.out.print("Digite a primeira nota:");
        nota1 = leia.nextDouble();

        System.out.print("Digite a segunda nota:");
        nota2 = leia.nextDouble();

        media = (nota1 + nota2)/2;

        System.out.println("Média: " + media);

        if (media<3) {

            System.out.println("Aluno reprovado");

        } else if (media>=6) {

            System.out.println("Aluno aprovado");

        } else {

            System.out.println("Aluno tem que fazer exame");

            System.out.print("Digite a nota do exame: ");
            notaExame = leia.nextDouble();

            novaMedia = (media+notaExame)/2;

            System.out.println("Nova média: " + novaMedia);

            if (novaMedia>=6) {
                System.out.println("Aluno aprovado");
                
            } else {
                System.out.println("Aluno reprovado");
                
            }
        }

        leia.close();
    }
}