package com.cultural.demo.models;

public class Filme {
    // id, título, sinopse, gênero e ano de lançamento

    private Long id;
    private String titulo;
    private String sinopse;
    private String genero;
    private int anoLancamento;

    public Filme(Long id, String titulo, String sinopse, String genero, int anoLancamento) {
        this.id = id;
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

}
