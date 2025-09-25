package br.com.etechas.tests;
import br.com.etechas.models.Conta;
import br.com.etechas.models.Corrente;
import br.com.etechas.models.Poupanca;

public class TesteConta {
    public static void main(String[] args){
        Conta conta = new Conta();
        System.out.println(conta.creditar(500));
        System.out.println(conta.debitar(200));
        System.out.println(conta.debitar(400));


        Poupanca poupanca = new Poupanca();
        
    }
}
