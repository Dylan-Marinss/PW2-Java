public class Anime {
    //Nome da Dupla; Dylan de Marins Silva Santos 251167
//Vitor picciuti dos Santos 251405

    public String nome;
    public int classificacaoIndicativa;
    public String genero;
    public String autor;
    public int qtdEpisodios;
    public int numeroTemporadas;
    public String mensagem;
    double media;

    public int mediaEpisodiosPorTemporada(){
       return  (int) qtdEpisodios / numeroTemporadas;
    }

        public String exibirClassificacao() {

            if (classificacaoIndicativa >= 10 && classificacaoIndicativa < 12) {
                System.out.println("De acordo com o ministerido da justica esse anime é NÃO RECOMENDADO PARA MENORES DE 10 ANOS");
            } else if (classificacaoIndicativa >= 12 && classificacaoIndicativa < 14) {
                System.out.println("De acordo com o ministerido da justica esse anime é NÃO RECOMENDADOS PARA MENORES DE 14 ANOS");
            } else if (classificacaoIndicativa >= 14 && classificacaoIndicativa < 16) {
                System.out.println("De acordo com o ministerido da justica esse anime é NÃO RECOMENDADOS PARA MENORES DE 16 ANOS");
            } else {
                System.out.println("De acordo com o ministerido da justica esse anime é NÃO RECOMENDADOS PARA MENORES DE 18 ANOS");
            }
            return "LIVRE PARR TODOS OS PÚBLICOS";
        }

        public void exibirDadosAnime() {
            this.mensagem = "Nome do anime: " +  nome + "\n" +
                    "De acordo com o ministério da justiça esse anime é " +
                    exibirClassificacao() + "\n" +
                    "A média de episódios por temporada é " + mediaEpisodiosPorTemporada()
                    + ".\n";
        /*System.out.println("Nome: " + nome); //ERRADO
            exibirClassificacao();
            System.out.println("A media de episodios por temporadas é " + (int) MediaEpisodiosPorTemporada());*/
        }

}

