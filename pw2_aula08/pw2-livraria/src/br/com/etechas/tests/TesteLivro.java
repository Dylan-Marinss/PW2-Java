package br.com.etechas.tests;

import br.com.etechas.enums.TipoCapaEnum;
import br.com.etechas.models.Editora;
import br.com.etechas.models.Livro;
import br.com.etechas.models.LivroFisico;

import java.util.Scanner;

public class TesteLivro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Editora editora = new Editora();
        editora.setNome("Rocco");
        editora.setEmail("contato@rocco.com");

        LivroFisico meuLivro = new LivroFisico("Harry Potter");
       // meuLivro.titulo = "Harry Potter";
        meuLivro.setEditora(editora);
        meuLivro.setValor(35.99);
        meuLivro.setPaginas(208);
        meuLivro.setResumo("Harry Potter é um garoto....");
        meuLivro.setAutor("J.K. Rowling");
        meuLivro.setTipoCapa(TipoCapaEnum.CAPA_COMUM);

        System.out.println(meuLivro.getTitulo() +
                " foi escrito por " + meuLivro.getAutor() +
                " e tem " + meuLivro.getPaginas()
                + "páginas e foi publicado pela editora " + meuLivro.getEditora().nome);


        LivroFisico livroDaFatima = new LivroFisico("Java");
        //livroDaFatima.titulo= "Java";

        Livro favorito = meuLivro;
        System.out.println(favorito.getTitulo());
        System.out.println("Meu livro: " + meuLivro + " | favorito: " + favorito
        + " | br.com.etechas.models.Livro da Fatima: " + livroDaFatima);

        favorito.setTitulo("Sei lá");
        System.out.println(meuLivro.getTitulo());

    }
}
