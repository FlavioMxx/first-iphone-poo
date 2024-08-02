package br.com.edu.dev.flaviomxx.entity;

import br.com.edu.dev.flaviomxx.interfaces.AparelhoTelefonico;
import br.com.edu.dev.flaviomxx.interfaces.NavegadorDeInternet;
import br.com.edu.dev.flaviomxx.interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorDeInternet, ReprodutorMusical {

    private String cor;
    private String modelo;

    public Iphone(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void ligar(Contato contato)  {
        System.out.printf("Ligando para %s\n", contato);
    }

    @Override
    public void atender(Contato contato)  {
        System.out.printf("Atendendo %s\n", contato.getNome());
    }

    @Override
    public void iniciarCorreioDeVoz(Contato contato) {
        System.out.printf("Iniciando correio de voz do(a) %s\n", contato.getNome());
    }

    @Override
    public void exibirPagina()  {
        System.out.println("Exibindo página");
    }


    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova página adicionada!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando...");
    }

    @Override
    public void tocar(Musica musica) {
        System.out.printf("Tocando a musica: %s, do cantor %s\n selecionada!", musica.getNome(), musica.getCantor());
    }

    @Override
    public void pausar(Musica musica)  {
        System.out.printf("Pausando a musica: %s\n", musica.getNome());
    }

    @Override
    public void selecionarMusica(Musica musica)  {
        System.out.printf("Musica: %s do album %s cantada por %s\n", musica.getNome(), musica.getAlbum(), musica.getCantor());
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

}
