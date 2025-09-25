package br.com.etechas.models;

public class Diaria extends Despesa{

    private double qtdDiaria;

    public void cadastrarDespesa(String descricao, double qtdDiaria) {
        this.qtdDiaria = qtdDiaria;
     super.cadastrarDespesa(descricao);
    }

    @Override
    public double calcularDespesa() {
        this.valorTotal = qtdDiaria * 50;
        return this.valorTotal;
    }

    @Override
    public String listarDespesa() {
        return "Quantidade de diaria:" + qtdDiaria;
    }
}
