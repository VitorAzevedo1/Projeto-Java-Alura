package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.PodCast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Complicada");
        minhaMusica.setCantor("Gustavo Lima");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        PodCast meuPodCast = new PodCast();
        meuPodCast.setTitulo("Veagazera");
        meuPodCast.setApresentador("Vitor Hugo");

        for (int i = 0; i < 5000; i++) {
            meuPodCast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodCast.curte();
        }

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(meuPodCast);
        minhasPreferidas.inclui(minhaMusica);
    }
}
