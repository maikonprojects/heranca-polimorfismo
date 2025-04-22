package org.example.empresa;

public class Gerente extends Funcionario{

    public Gerente(String nome, String instituicao, String escolaridade) {
        setNome(nome);
        setInstituicao(instituicao);
        setNivelEscolaridade(escolaridade);
        this.comissao = 1500;
    }

    @Override
    public double calcularRendaPorEscolaridade(String escolaridade) {
        return super.calcularRendaPorEscolaridade(escolaridade);
    }

}
