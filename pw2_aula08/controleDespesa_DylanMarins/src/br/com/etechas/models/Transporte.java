package br.com.etechas.models;

public class Transporte extends Despesa{
    private double kmPercorrido;
    private double valorPedagios;

    public void cadastrarDespesa(String descricao, double kmPercorrido, double valorPedagios) {
        this.kmPercorrido = kmPercorrido;
        this.valorPedagios = valorPedagios;
        super.cadastrarDespesa(descricao);
    }

    @Override
    public double calcularDespesa() {
        this.valorTotal = (kmPercorrido * 3) + valorPedagios;
        return this.valorTotal;
    }

    @Override
    public String listarDespesa() {
        return "Km percorrido" + kmPercorrido + "Valor do Pedagio" +  valorPedagios;
    }
}
