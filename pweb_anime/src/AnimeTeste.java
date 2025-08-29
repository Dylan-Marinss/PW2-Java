import java.util.Scanner;
//Nome da Dupla; Dylan de Marins Silva Santos 251167
//Vitor picciuti dos Santos 251405

public class AnimeTeste {
    public static void main(String[] args)
    {
        Scanner texto = new Scanner(System.in);
        Scanner numeros = new Scanner(System.in);
        Anime a = new Anime();

        System.out.println("Digite o nome do anime: ");
        a.nome = texto.nextLine();

        System.out.println("Digite a classificação indicativa 10, 12, 14, 16, 18, para classificação livre digite 0 ");
        a.classificacaoIndicativa = numeros.nextInt();

        System.out.println("Digite o autor do anime: ");
        a.autor = texto.nextLine();

        System.out.println("Digite o genero do anime: ");
        a.genero = texto.nextLine();

        System.out.println("Digite a quantidade de episódios: ");
        a.qtdEpisodios = numeros.nextInt();

        System.out.println("Digite o numero de temporadas: ");
        a.numeroTemporadas = numeros.nextInt();

        System.out.println();
        a.exibirDadosAnime();

    }
}
