package br.com.edu.dev.flaviomxx.interfaces;

import br.com.edu.dev.flaviomxx.entity.Musica;

public interface ReprodutorMusical {

    void tocar(Musica musica);

    void pausar(Musica musica);

    void selecionarMusica(Musica musica);
}
