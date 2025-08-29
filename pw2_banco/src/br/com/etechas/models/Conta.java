package br.com.etechas.models;


public class Conta {

    private double saldo;
    private String tipo;

    //Get e Setters ;p
    public Conta(double valorInical) {
        this.saldo = valorInical;
        this.tipo = "Corrente";
    }

    public Conta(double valorInicial, String tipo) {
        this.saldo = valorInicial;
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Métodos (socorrooo Deusss

    public boolean depositar(double valor) {
        if (valor > 1000 && tipo.equals("Corrente")) {
            return false;
        }
        this.saldo += valor;
        return true;
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferir(double valor, Conta contaDestino){
        if(contaDestino.tipo.equals("Corrente")){
            return false;
        }else if(this.saldo - valor < 0){
            return false;
        }else
        {
            contaDestino.saldo += valor;
            this.saldo -= valor;
            return true;
        }

    }
}




