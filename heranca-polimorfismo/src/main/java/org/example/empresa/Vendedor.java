package org.example.empresa;

public class Vendedor extends Funcionario{

    public Vendedor(String nome, String instituicao, String escolaridade) {
        setNome(nome);
        setInstituicao(instituicao);
        setNivelEscolaridade(escolaridade);
        this.comissao = 250;
    }

    @Override
    public double calcularRendaPorEscolaridade(String escolaridade) {
        return super.calcularRendaPorEscolaridade(escolaridade);
    }

}
