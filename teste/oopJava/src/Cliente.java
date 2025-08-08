public class Cliente {
    private String nome;
    private int numeroContato;
    private String equipamentoTec;

    public Cliente(String nome, int numeroContato, String equipamentoTec){
        this.nome = nome;
        this.numeroContato = numeroContato;
        this.equipamentoTec = equipamentoTec;
    }

    public String getNome()
    {
        return nome;
    }
    public int getNumeroContato(){
        return numeroContato;
    }
    public String getEquipamentoTec(){
        return equipamentoTec;
    }

    public void exibirCliente(){
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Numero de contato: " + numeroContato);
        System.out.println("Equipamento entregue: " +equipamentoTec);
    }
}

