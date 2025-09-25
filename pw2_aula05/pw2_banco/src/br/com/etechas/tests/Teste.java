package br.com.etechas.tests;

import br.com.etechas.models.Conta;

public class Teste {
    public static void main(String[] args) {
        Conta cp = new Conta(2000, "Poupanca");
        Conta cc = new Conta(1000);

        if(cc.depositar(1500))
            System.out.println("Depósito efetuado com sucesso!");
        else
            System.out.println("Depósito não efetuado por questão de segurança");


        if(cp.depositar(1500))
            System.out.println("Depósito efetuado com sucesso na conta poupança!");
        else
            System.out.println("Depósito não efetuado por questão de segurança");


        if(cp.depositar(98.52))
            System.out.println("Depósito efetuado com sucesso na conta poupança!");
        else
            System.out.println("Depósito não efetuado por questão de segurança");


        if(cp.sacar(100))
            System.out.println("Saque efetuado com sucesso");
        else
            System.out.println("Não foi possivel efetuar o saque");


        if(cc.transferir(1800, cp))
            System.out.println("Transferido com sucesso!");


        if(cp.transferir(700, cc))
            System.out.println("Transferido com sucesso!");

        if(cp.sacar(1000))
            System.out.println("Saque efetuado com sucesso ");

        else
            System.out.println("Não foi possivel efetuar o saque");
        System.out.println("Saldo da Conta poupança: " + cp.getSaldo());
        System.out.println("Saldo da Conta corrente: " + cc.getSaldo());
    }

}
