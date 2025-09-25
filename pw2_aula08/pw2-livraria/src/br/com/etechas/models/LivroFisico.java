package br.com.etechas.models;

import br.com.etechas.enums.TipoCapaEnum;

public class LivroFisico extends Livro{

    public LivroFisico(String titulo) {
        super(titulo);
    }


    public LivroFisico(String titulo, String autor, double valor, Editora editora, int paginas, String resumo, TipoCapaEnum tipoCapa) {
        super(titulo, autor, valor, editora, paginas, resumo, tipoCapa);
    }

    public LivroFisico(String titulo, double valor, int paginas) {
        super(titulo, valor, paginas);
    }

    public double getTaxaImpressao(){
        return valor * 0.05;
    }

}
