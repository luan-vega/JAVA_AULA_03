import java.util.Scanner;

public class EXERCICIO_05 {

    /*Faça um programa para ler as 3 notas obtidas por um aluno nas 3 verificações e a média dos
exercícios que fazem parte da avaliação. Calcular a média de aproveitamento, usando a fórmula abaixo
e escrever o conceito do aluno de acordo com a tabela de conceitos mais abaixo:
                           N1 + N2 * 2 + N3 * 3 + Média_dos_Exercícios
Média_de_Aproveitamento = ----------------------------------------------
                                                    7
A atribuição de conceitos obedece a tabela abaixo:
Média de Aproveitamento     Conceito
    > = 9,0                     A
    > = 7,5 e < 9,0             B
    > = 6,0 e < 7,5             C
    < 6,0                       D
 *
 */
    public static void main(String [] args) {

        float nota1;
        float nota2;
        float nota3;
        float mediaExer;
        float mediaFinal;
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe as suas três médias: ");
        nota1 = leia.nextFloat();
        nota2 = leia.nextFloat();
        nota3 = leia.nextFloat();
        System.out.println("Agora informe a média dos exercícios");
        mediaExer = leia.nextFloat();

        mediaFinal = (nota1 + (nota2 * 2) + (nota3 * 3) + mediaExer) / 7;

        if (mediaFinal >= 9) {
            System.out.println("Conceito: A\nMédia Final: " + mediaFinal);
        } else if (mediaFinal >= 7.5 && mediaFinal < 9) {
            System.out.println("Conceito: B\nMédia Final: " + mediaFinal);
        } else if (mediaFinal >= 6 && mediaFinal < 7.5) {
            System.out.println("Conceito: C\nMédia Final: " + mediaFinal);
        } else {
            System.out.println("Conceito: D\nMédia Final: " + mediaFinal);
        }
        // && -> E          || -> OU        ! -> NÃO
        // != -> diferente
    }

}
