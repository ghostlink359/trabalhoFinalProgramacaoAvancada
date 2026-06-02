package dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ConexaoArquivo {

    public static void salvarLinha(
            String arquivo,
            String conteudo) {

        try {

            BufferedWriter writer =
                    new BufferedWriter(
                            new FileWriter(
                                    arquivo,
                                    true));

            writer.write(conteudo);
            writer.newLine();

            writer.close();

        } catch (IOException e) {

            System.out.println(
                    "Erro ao salvar arquivo.");
        }
    }
}