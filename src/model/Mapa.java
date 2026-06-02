package model;

import interfaces.Visualizavel;

public class Mapa implements Visualizavel {

    private String nome;
    private String regiao;

    public Mapa(String nome, String regiao) {
        this.nome = nome;
        this.regiao = regiao;
    }

    public String getNome() {
        return nome;
    }

    public String getRegiao() {
        return regiao;
    }

    @Override
    public void exibir() {
        System.out.println("Mapa: " + nome);
        System.out.println("Região: " + regiao);
    }
}