package org.example.empresa;

public class Funcionario {
    private String nome;
    private String nivelEscolaridade;
    private String instituicao;
    private Integer codigo;

    public Funcionario(String nome, String instituicao, String nivelEscolaridade) {
        this.nome = nome;
        this.instituicao = instituicao;
        this.nivelEscolaridade = nivelEscolaridade;
    }
    public Funcionario(String nome, String nivelEscolaridade, Integer codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.nivelEscolaridade = nivelEscolaridade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " - Nivel: " + nivelEscolaridade ;
    }
}
