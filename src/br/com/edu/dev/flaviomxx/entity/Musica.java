package br.com.edu.dev.flaviomxx.entity;

public class Musica {
    private String nome;
    private String cantor;
    private String album;

    public Musica(String nome, String cantor, String album) {
        this.nome = nome;
        this.cantor = cantor;
        this.album = album;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "nome='" + nome + '\'' +
                ", cantor='" + cantor + '\'' +
                ", album='" + album + '\'' +
                '}';
    }
}
