public class Livro {
    // Atributos - Características dos objetos
    String tituloLivro;
    String autorLivro;
    int paginas;
    double valorLivro;
    String editora;
    String sinopseLivro;
    String tipoCapa;

    // Construtor
    public Livro(String tituloLivro, String autorLivro, int paginas, double valorLivro, String editora, String tipoCapa, String sinopseLivro) {
        this.tituloLivro = tituloLivro;
        this.autorLivro = autorLivro;
        this.paginas = paginas;
        this.valorLivro = valorLivro;
        this.editora = editora;
        this.tipoCapa = tipoCapa;
        this.sinopseLivro = sinopseLivro;
    }

    // Construtor padrão
    public Livro() {
    }

    // Métodos Getters e Setters
    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public double getValorLivro() {
        return valorLivro;
    }

    public void setValorLivro(double valorLivro) {
        this.valorLivro = valorLivro;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getSinopseLivro() {
        return sinopseLivro;
    }

    public void setSinopseLivro(String sinopseLivro) {
        this.sinopseLivro = sinopseLivro;
    }

    public String getTipoCapa() {
        return tipoCapa;
    }

    public void setTipoCapa(String tipoCapa) {
        this.tipoCapa = tipoCapa;
    }

    // Método para exibir as informações do livro
    public void exibirLivro() {
        System.out.println("Nome do livro: " + tituloLivro);
        System.out.println("Autor do livro: " + autorLivro);
        System.out.println("Valor do livro: " + valorLivro);
        System.out.println("Número de páginas: " + paginas);
        System.out.println("Editora do livro: " + editora);
        System.out.println("Sinopse do livro: " + sinopseLivro);
        System.out.println("Tipo da capa: " + tipoCapa);
    }
}
