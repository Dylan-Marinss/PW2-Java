package br.com.etechas.tests;

import br.com.etechas.models.Funcionario;
import br.com.etechas.models.Gerente;
import br.com.etechas.models.Vendedor;

public class TesteFuncionario {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("João");
        funcionario.setSalario(5000);
        funcionario.exibirDados();
        System.out.println(funcionario.calcularBonificacao());

        Gerente gerente = new Gerente();
        gerente.setNome("Maria");
        gerente.setSalario(10000);
        gerente.setGratificacao(500);
        gerente.exibirDados();
        System.out.println(gerente.calcularBonificacao());

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Miguel");
        vendedor.setSalario(6000);
        System.out.println(vendedor.calcularComissao(500));

    }
}
