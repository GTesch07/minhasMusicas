package com.guilherme.tesch.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >=9 ){
            System.out.println(audio.getTitulo() + """
                     é consideredado sucesso absoluto e prefirido por todos!
                    """ );
        }else {
            System.out.println(audio.getTitulo() + " Também é um dos que todo mundo está curtindo.");
        }
    }
}
