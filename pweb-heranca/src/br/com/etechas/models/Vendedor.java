package br.com.etechas.models;

public class Vendedor  extends Funcionario{

    public double calcularComissao(double valor){
        return salario + valor;
    }
}
