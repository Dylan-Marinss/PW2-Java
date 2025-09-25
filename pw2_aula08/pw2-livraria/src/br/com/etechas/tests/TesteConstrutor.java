package br.com.etechas.tests;

import br.com.etechas.models.Editora;
import br.com.etechas.models.Livro;
import br.com.etechas.models.LivroDigital;
import br.com.etechas.models.LivroFisico;

import java.util.Scanner;

public class TesteConstrutor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Editora editora = new Editora();
        editora.setNome("Rocco");
        editora.setEmail("contato@rocco.com");

        System.out.println("Informe o nome do livro: ");
        String titulo = leitor.nextLine();
        System.out.println("Valor: ");
        double preco = leitor.nextDouble();
        System.out.println("Quantida de páginas: ");
        int qtd = leitor.nextInt();
        LivroFisico livro = new LivroFisico(titulo);

        LivroDigital livro2 = new LivroDigital(titulo,preco,qtd);
    }
}
