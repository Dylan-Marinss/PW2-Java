public class TesteLivro {
    public  static  void main(String[] args){

        Livro meuLivro = new Livro();
        meuLivro.tituloLivro = "Harry Potter";
        meuLivro.editora = "Rocco";
        meuLivro.valorLivro = 35.99;
        meuLivro.paginas =208;
        meuLivro.sinopseLivro = "Harry Potter é um garoto";
        meuLivro.autorLivro = "J.K. Rowling";
        meuLivro.tipoCapa = "Capa Dura";
        System.out.println(meuLivro.tituloLivro + " foi escrito por " + meuLivro.autorLivro+ " tem " + meuLivro.paginas + " paginas");
    }
}
