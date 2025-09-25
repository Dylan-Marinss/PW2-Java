package br.com.etechas.models;


public class Gerente extends Funcionario {
    private double gratificacao;

    public void exibirDados(){
        super.exibirDados();
        System.out.println( "gratificacao  " + gratificacao );
    }

    public double calcularBonificacao()
    {
       return super.calcularBonificacao() + 2000;
       //(salario + salario * 0.1)
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }
}
