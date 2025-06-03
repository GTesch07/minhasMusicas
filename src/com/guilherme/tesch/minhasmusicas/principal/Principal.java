package com.guilherme.tesch.minhasmusicas.principal;

import com.guilherme.tesch.minhasmusicas.modelos.MinhasPreferidas;
import com.guilherme.tesch.minhasmusicas.modelos.Musica;
import com.guilherme.tesch.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args){
        Musica minhaMusica = new Musica();

        minhaMusica.setTitulo("Mockingbird");
        minhaMusica.setArtista("Eminem");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }


        Podcast meuPodcast = new Podcast();

        meuPodcast.setTitulo("PodPah");
        meuPodcast.setHost("Igão e Mítico");

        for (int i = 0; i < 5000; i ++){
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i ++){
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();

        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
