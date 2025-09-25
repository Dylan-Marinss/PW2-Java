package br.com.etechas.models;

public class Conta {
    protected double saldo;

    public String consultarSaldo(){
        return "R$" + saldo;
    }

    public String creditar(double valor) {
        if (valor > 0)
            saldo += valor;
        return consultarSaldo();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String debitar(double valor)
    {
        if(valor <= saldo) {
        return "Saldo Insuficiente" + consultarSaldo();
    }
    else
        {
            return consultarSaldo();
        }



    }
}
