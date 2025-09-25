package br.com.etechas.models;

import br.com.etechas.enums.TipoCapaEnum;

public class LivroDigital  extends Livro {
    private String marcaDAgua;

    public LivroDigital(String titulo) {
        super(titulo);
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        if(valor + porcentagem/100 > 10)
        return 0;
        else
            return valor + porcentagem;
    }

    public LivroDigital(String titulo, String autor, double valor, Editora editora, int paginas, String resumo, TipoCapaEnum tipoCapa) {
        super(titulo, autor, valor, editora, paginas, resumo, tipoCapa);
    }

    public LivroDigital(String titulo, String marcaDAgua) {
        super(titulo);
        this.marcaDAgua = marcaDAgua;
    }

    public LivroDigital(String titulo, double preco, int qtd) {
        super(titulo, preco, qtd);
    }

    public String getMarcaDAgua() {
        return marcaDAgua;
    }

    public void setMarcaDAgua(String marcaDAgua) {
        this.marcaDAgua = marcaDAgua;
    }
}
