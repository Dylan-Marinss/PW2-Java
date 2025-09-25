package br.com.etechas.models;

public abstract class Despesa {
    protected String descricao;
    protected double valorTotal;


    public void cadastrarDespesa(String descricao){
        this.descricao = descricao;
        this.valorTotal = 0;
    }

    public abstract double calcularDespesa();

    public abstract String listarDespesa();

    public double getValorTotal() {
        return valorTotal;
    }

    public String getDescricao() {
        return descricao;
    }
}
