package br.com.alura.matchstream.principal;

import br.com.alura.matchstream.modelos.Filme;
import br.com.alura.matchstream.modelos.Serie;
import br.com.alura.matchstream.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme umFilme = new Filme("O Poderoso Chefão", 1970);
        umFilme.avalia(8);
        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.avalia(9);
        Filme filmeDoVitor = new Filme("Interestellar",2014);
        filmeDoVitor.avalia(10);
        Serie lost = new Serie("Lost", 2000);
        lost.avalia(7);

        List<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoVitor);
        lista.add(umFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for(Titulo item : lista){
            System.out.println(item);
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("The Rock");
        buscaPorArtista.add("Taylor Swift");
        buscaPorArtista.add("Blake Shelton");
        buscaPorArtista.add("Ed Sheeran");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);

        System.out.println("Pos ordenação: " + buscaPorArtista);

        Collections.sort(lista);
        System.out.println( "Listas de titulos de ordenados: " + lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando Titulos por Ano: \n" + lista);
    }
}
