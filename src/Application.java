import br.com.edu.dev.flaviomxx.entity.Contato;
import br.com.edu.dev.flaviomxx.entity.Iphone;
import br.com.edu.dev.flaviomxx.entity.Musica;

public class Application {
    public static void main(String[] args) {

        Musica musica = new Musica("Meu Lugar", "Arlindo Cruz", "Sambista perfeito");
        Contato contato = new Contato("Flavio Milani", "+5511987654321");
        Iphone iphone = new Iphone("Preto", "13 Mini");

        iphone.tocar(musica);
        iphone.pausar(musica);
        iphone.selecionarMusica(musica);

        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        iphone.ligar(contato);
        iphone.atender(contato);
        iphone.iniciarCorreioDeVoz(contato);
    }
}