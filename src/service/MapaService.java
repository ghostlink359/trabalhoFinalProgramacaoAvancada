package service;

import java.util.ArrayList;
import java.util.List;

import model.Mapa;

public class MapaService {

    private List<Mapa> mapas;

    public MapaService() {
        mapas = new ArrayList<>();
    }

    public void adicionarMapa(Mapa mapa) {
        mapas.add(mapa);
    }

    public List<Mapa> listarMapas() {
        return mapas;
    }

    public void exibirTodos() {

        for (Mapa mapa : mapas) {
            mapa.exibir();
        }

    }
}