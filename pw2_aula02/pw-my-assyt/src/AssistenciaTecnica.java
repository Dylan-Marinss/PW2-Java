import java.time.LocalDateTime;

public class AssistenciaTecnica {

    public static Object Status;

    public static class Tecnico{
        String nome;
        String telefone;
        String email;
    }
    public static class Servico{
        String descricao;
        double valor;

        public Servico(String trocaDeTela, double v) {
        }
    }

    public static class OrdemServico{
        LocalDateTime dataEntrada;
        LocalDateTime previsao;
        String defeito;
        LocalDateTime datasSaida;
        String status;
        int propriedade;
        String observacoes;

    }
}
