package br.com.etechas.tests;

import br.com.etechas.models.Editora;
import br.com.etechas.models.Livro;

import java.util.Scanner;

public class TesteConstrutor {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Editora editora = new Editora(); //Contrutor nometal()
        editora.nome = "Rocco";
        editora.email = "contato@rocco.com";

        System.out.println("Informe o nome do livro:");
        String titulo = ler.nextLine();
        System.out.println("Valor: ");
        double preco = ler.nextDouble();
        System.out.println("Quantidade de paginas: ");
        int qtd = ler.nextInt();
        Livro livro = new Livro(titulo);
    }
}
