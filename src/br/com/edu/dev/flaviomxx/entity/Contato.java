package br.com.edu.dev.flaviomxx.entity;

public class Contato {
    private String nome;
    private String contato;

    public Contato(String nome, String contato) {
        this.nome = nome;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return nome + " - " + contato;
    }
}
