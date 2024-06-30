package com.cultural.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cultural.demo.models.Analise;
import com.cultural.demo.models.Filme;

@RestController
public class AnaliseControllers {
    List<Analise> listaDeAnalises = new ArrayList<>();

    @PostMapping("/analise")
    public void criarAnalise(@RequestBody Analise analiseRecebida) {
        listaDeAnalises.add(analiseRecebida);
    }

    @GetMapping("/analise")
    @ResponseBody
    public List<Analise> coletarAnalises() {
        return listaDeAnalises;
    }

    @DeleteMapping("/analise/{id}")
    public void deletarAnalise(@PathVariable("id") int id) {
        listaDeAnalises.removeIf(analise -> analise.getId() == id);
    }

    @PutMapping("/analise/{id}")
    public void editarAnalise(@PathVariable("id") int id) {
        for (Analise analise : listaDeAnalises) {
            if (analise.getId() == id) {
                // Editar analise aqui
            }
        }
    }

}