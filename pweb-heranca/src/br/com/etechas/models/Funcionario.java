package br.com.etechas.models;

public class Funcionario
{
    private String nome;
    protected double salario;

    public void exibirDados(){
        System.out.println("\nNome " + getNome() + "  \nsalario " + salario);
    }

    public double calcularBonificacao() {
        return salario + salario * 0.1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
