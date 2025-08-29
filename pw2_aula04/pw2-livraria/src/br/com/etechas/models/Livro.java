package br.com.etechas.models;

import br.com.etechas.enums.TipoCapaEnum;

public class Livro {

    //Atributos - Características do objeto
    //sintaxe: tipo nome;
    private String titulo;
    private String autor;
    private double valor;
    private Editora editora;
    private int paginas;
    private String resumo;
    private TipoCapaEnum tipoCapa;

    //Método get => retorna o conteúdo de um atributo
    //private String titulo;
    public String getTitulo(){
        return titulo;
    }
    //Método set => Recebe um conteúdo para armazenar no atributo
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public Livro(){}
    //Construtor
    //Nome da classe, não tem retorno
    public Livro(String titulo){
        this.titulo = titulo;
    }

    public Livro(String titulo, String autor, double valor,
                 Editora editora, int paginas, String resumo,
                 TipoCapaEnum tipoCapa) {
        this.titulo = titulo;
        this.autor = autor;
        this.valor = valor;
        this.editora = editora;
        this.paginas = paginas;
        this.resumo = resumo;
        this.tipoCapa = tipoCapa;
    }

    public Livro(String titulo, double valor, int paginas) {
        this.titulo = titulo;
        this.valor = valor;
        this.paginas = paginas;
    }

    public Livro(double valor, int paginas, TipoCapaEnum tipoCapa) {
        this.valor = valor;
        this.paginas = paginas;
        this.tipoCapa = tipoCapa;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public TipoCapaEnum getTipoCapa() {
        return tipoCapa;
    }

    public void setTipoCapa(TipoCapaEnum tipoCapa) {
        this.tipoCapa = tipoCapa;
    }

    //public br.com.etechas.models.Livro(){}
    //Métodos - Ações que objeto pode ter
}
