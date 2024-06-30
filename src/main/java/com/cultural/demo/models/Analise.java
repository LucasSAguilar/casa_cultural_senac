package com.cultural.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Analise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Filme filme;
    private String analise;

    public Analise() {

    }

    public Analise(int id, Filme filme, String analise) {
        this.id = id;
        this.filme = filme;
        this.analise = analise;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
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
