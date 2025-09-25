package br.com.etechas.models;

public class Alimentacao extends Despesa{
    private String nomeRestaurante;
    private int qtdRefeicao;


    public void cadastrarDespesa(String descricao, String nomeRestaurante, int qtdRefeicao) {
        this.nomeRestaurante = nomeRestaurante;
        this.qtdRefeicao = qtdRefeicao;
        super.cadastrarDespesa(descricao);
    }

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    public int getQtdRefeicao() {
        return qtdRefeicao;
    }

    public void setQtdRefeicao(int qtdRefeicao) {
        this.qtdRefeicao = qtdRefeicao;
    }

    @Override
    public double calcularDespesa() {
        this.valorTotal = qtdRefeicao * 18;
        return this.valorTotal;
    }

    @Override
    public String listarDespesa() {
        return "Nome de restaurante:" + nomeRestaurante + " " + "quantidade de Refeição" + qtdRefeicao;
    }
}
