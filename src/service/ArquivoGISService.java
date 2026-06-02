package service;

import dao.ArquivoGISDAO;
import dao.ConexaoArquivo;
import exception.ArquivoInvalidoException;
import model.ArquivoGIS;

public class ArquivoGISService {

    private ArquivoGISDAO arquivoDAO;

    public ArquivoGISService(
            ArquivoGISDAO arquivoDAO) {

        this.arquivoDAO = arquivoDAO;
    }

    public void carregarArquivo(
            ArquivoGIS arquivo)
            throws ArquivoInvalidoException {

        if (arquivo.getNomeArquivo() == null
                || arquivo.getNomeArquivo().isEmpty()) {

            throw new ArquivoInvalidoException(
                    "Arquivo inválido.");
        }

        arquivoDAO.salvar(arquivo);

        ConexaoArquivo.salvarLinha(
                "arquivos.txt",
                arquivo.getNomeArquivo()
        );
    }
}