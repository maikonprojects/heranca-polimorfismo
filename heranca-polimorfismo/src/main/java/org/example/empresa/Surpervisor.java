package org.example.empresa;

public class Surpervisor extends Funcionario{

    public Surpervisor(String nomeNovo, String instituicao, String escolaridade) {
        setNome(nomeNovo);
        setInstituicao(instituicao);
        setNivelEscolaridade(escolaridade);
        this.comissao = 650;
    }

    @Override
    public double calcularRendaPorEscolaridade(String escolaridade) {
        return super.calcularRendaPorEscolaridade(escolaridade);
    }

}
