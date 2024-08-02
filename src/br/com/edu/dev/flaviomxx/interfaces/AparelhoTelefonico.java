package br.com.edu.dev.flaviomxx.interfaces;

import br.com.edu.dev.flaviomxx.entity.Contato;

public interface AparelhoTelefonico {

    public void ligar(Contato contato);

    public void atender(Contato contato);

    public void iniciarCorreioDeVoz(Contato contato);
}
