import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double peso, altura, imc;
        System.out.println("Informe o peso: ");
        peso = leitor.nextDouble();
        System.out.println("Informe a altura: ");
        altura = leitor.nextDouble();
        imc = peso / (altura * altura);
        System.out.printf("IMC = %.1f\n", imc);
        if(imc < 18.5)
            System.out.println("Abaixo do peso");
        else if(imc < 25)
            System.out.println("Peso normal");
        else if(imc < 30)
            System.out.println("Sobrepeso");
        else if(imc < 35)
            System.out.println("Obesidade Grau I");
        else if(imc < 40)
            System.out.println("Obesidade Grau II");
        else
            System.out.println("Obesidade Grau III");
    }
}
