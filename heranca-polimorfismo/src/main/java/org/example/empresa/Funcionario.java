package org.example.empresa;

public class Funcionario {
    private String nome;
    private String nivelEscolaridade;
    private String instituicao;
    private Integer codigo;
    protected double renda = 1000;
    protected double comissao;

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

    public Funcionario() {
    }

    public double calcularRendaPorEscolaridade(String escolaridade){

        double renda1 = 1000 + (1000 * 0.1) ;
        double renda2 =  renda1 + (renda1 * (0.5));
        double renda3 =  renda2 + (renda2 * (1));

        if(escolaridade.equalsIgnoreCase("ensino básico")){
            renda = renda1;
        }else if(escolaridade.equalsIgnoreCase("ensino médio")){
            renda = renda2;
        }else {
            renda = renda3;
        }
        //System.out.println(comissao);
        return  renda + comissao;
    }

    public double calcularRendaTotal(){
        //System.out.println(comissao);
        return renda + comissao;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getNivelEscolaridade() {
        return nivelEscolaridade;
    }

    public void setNivelEscolaridade(String nivelEscolaridade) {
        this.nivelEscolaridade = nivelEscolaridade;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " - Nivel: " + nivelEscolaridade + " - Renda total: " + renda + " - Comissão: " + comissao;
    }

    public double getComissao() {
        return comissao;
    }
}
