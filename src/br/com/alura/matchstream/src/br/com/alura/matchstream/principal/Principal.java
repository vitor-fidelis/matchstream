package br.com.alura.matchstream.principal;

import br.com.alura.matchstream.calculos.CalculadoraDeTempo;
import br.com.alura.matchstream.calculos.FiltroRecomendacao;
import br.com.alura.matchstream.modelos.Episodio;
import br.com.alura.matchstream.modelos.Filme;
import br.com.alura.matchstream.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Filme umFilme = new Filme("O Poderoso Chefão", 1970);
        umFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + umFilme.getDuracaoEmMinutos());

        umFilme.exibeFichaTecnica();
        umFilme.avalia(8);
        umFilme.avalia(5);
        umFilme.avalia(10);
        System.out.println("Total de avaliações: " + umFilme.getTotalDeAvaliacoes());
        System.out.println(umFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(umFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(umFilme);

        var episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVizualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoVitor = new Filme("Interestellar",2014);
        filmeDoVitor.setDuracaoEmMinutos(180);
        filmeDoVitor.setDiretor("Christopher Nolan");
        filmeDoVitor.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoVitor);
        listaDeFilmes.add(umFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista é: " + listaDeFilmes.size());
        System.out.println("Primeiro Filme: " + listaDeFilmes.get(0).getNome() + "\nDiretor: " + filmeDoVitor.getDiretor());
        System.out.println("toString reescrito: " + listaDeFilmes );

    }
}