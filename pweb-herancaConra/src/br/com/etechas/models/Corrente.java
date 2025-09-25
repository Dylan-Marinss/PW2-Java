package br.com.etechas.models;

public class Corrente extends Conta{
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String debitar(double valor) {
        if (valor > 0 && valor <= (super.getSaldo() + limite)) {
            super.setSaldo(super.getSaldo() - valor );
            return super.consultarSaldo();
        }
        else{
            return "Saldo insuficiente" + super.consultarSaldo();
        }
    }

}
