package org.example.animais;

public class Animal {
    private String nome;
    private String som;
    private String movimento;
    private int idade;

    public Animal(String nome, int idade, String som, String movimento) {
        this.nome = nome;
        this.idade = idade;
        this.som = som;
        this.movimento = movimento;
    }

    public String emitirSom(){
        return som;
    }
    public String movimentar(){
        return movimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public String getMovimento() {
        return movimento;
    }

    public void setMovimento(String movimento) {
        this.movimento = movimento;
    }
}
