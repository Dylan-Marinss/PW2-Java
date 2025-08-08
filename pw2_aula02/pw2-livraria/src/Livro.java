public class Livro {
    //Atributos - Caracteristica dos objetos

    //Sintaxe: tipo nome;
     String titutoLivro;
     String autorLivro;
     int paginas;
     double valorLivro;
    String editora;
    String sinopseLivro;
   String tipoCapa;

    //Metodos - Ações
    public Livro(String titutoLivro, String autorLivro, int paginas, double valorLivro, String editora, String tipoCapa, String sinopseLivro)
    {
        this.autorLivro = autorLivro;
        this.editora = editora;
        this.titutoLivro = titutoLivro;
        this.sinopseLivro = sinopseLivro;
        this.valorLivro = valorLivro;
        this.paginas = paginas;
        this.tipoCapa = tipoCapa;
    }

    public String getTitutoLivro()
    {
        return titutoLivro;
    }
}
