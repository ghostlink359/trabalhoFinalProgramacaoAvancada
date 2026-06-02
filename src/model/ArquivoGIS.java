package model;

import interfaces.Visualizavel;

public class ArquivoGIS implements Visualizavel {

    private String nomeArquivo;
    private String caminho;

    public ArquivoGIS(String nomeArquivo, String caminho) {
        this.nomeArquivo = nomeArquivo;
        this.caminho = caminho;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public String getCaminho() {
        return caminho;
    }

    @Override
    public void exibir() {
        System.out.println("Arquivo GIS: " + nomeArquivo);
        System.out.println("Caminho: " + caminho);
    }
}