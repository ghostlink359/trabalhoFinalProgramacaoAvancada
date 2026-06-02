package dao;

import java.util.ArrayList;
import java.util.List;

import model.ArquivoGIS;

public class ArquivoGISDAO {

    private List<ArquivoGIS> arquivos;

    public ArquivoGISDAO() {
        arquivos = new ArrayList<>();
    }

    public void salvar(ArquivoGIS arquivo) {
        arquivos.add(arquivo);
    }

    public List<ArquivoGIS> listar() {
        return arquivos;
    }
}