package com.cultural.demo.models;

public class Analise {
    private Long id;
    private Filme filme;
    private String analise;

    public Analise(Long id, Filme filme, String analise) {
        this.id = id;
        this.filme = filme;
        this.analise = analise;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Filme getFilme() {
        return this.filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public String getAnalise() {
        return this.analise;
    }

    public void setAnalise(String analise) {
        this.analise = analise;
    }

}
