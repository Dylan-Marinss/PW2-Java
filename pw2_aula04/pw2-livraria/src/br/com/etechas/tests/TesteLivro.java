package br.com.etechas.tests;

import br.com.etechas.enums.TipoCapaEnum;
import br.com.etechas.models.Editora;
import br.com.etechas.models.Livro;

import java.util.Scanner;

public class TesteLivro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Editora editora = new Editora();
        editora.nome = "Rocco";
        editora.email = "contato@rocco.com";

        Livro meuLivro = new Livro("Harry Potter");
        // meuLivro.titulo = "Harry Potter";
        meuLivro.editora = editora;
        meuLivro.valor = 35.99;
        meuLivro.paginas = 208;
        meuLivro.resumo = "Harry Potter é um garoto....";
        meuLivro.autor = "J.K. Rowling";
        meuLivro.tipoCapa = TipoCapaEnum.CAPA_COMUM;

        System.out.println(meuLivro.titulo +
                " foi escrito por " + meuLivro.autor+
                " e tem " + meuLivro.paginas
                + "páginas e foi publicado pela editora " + meuLivro.editora.nome);


        Livro livroDaFatima = new Livro("Java");
        //livroDaFatima.titulo= "Java";

        Livro favorito = meuLivro;
        System.out.println(favorito.titulo);
        System.out.println("Meu livro: " + meuLivro + " | favorito: " + favorito
                + " | br.com.etechas.models.Livro da Fatima: " + livroDaFatima);

        favorito.titulo = "Sei lá";
        System.out.println(meuLivro.titulo);

    }
}
