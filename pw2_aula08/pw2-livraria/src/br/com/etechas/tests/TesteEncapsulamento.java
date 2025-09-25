package br.com.etechas.tests;

import br.com.etechas.models.Livro;
import br.com.etechas.models.LivroDigital;
import br.com.etechas.models.LivroFisico;

public class TesteEncapsulamento {
    public static void main(String[] args) {
        LivroFisico l = new LivroFisico("Java");
        LivroDigital ld = new LivroDigital("Teste", "TesteMarcaDagua");
    }
}
