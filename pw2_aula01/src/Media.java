import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        //Entrada, saída e processamento
        //Declarar um objeto para entrada
        Scanner leitor = new Scanner(System.in);
        //Declaração de variável
        double n1, n2, res;
        String nomeAluno;
        //Saída
        System.out.println("Digite o nome do aluno: ");
        nomeAluno = leitor.nextLine();
        System.out.println("Digite um número: ");
        n1 = leitor.nextDouble();
        System.out.println("Digite segundo número: ");
        n2 = leitor.nextDouble();
        res = (n1 + n2) / 2;
        System.out.println("O aluno " + nomeAluno +
                " teve média = " + res );



    }
}
