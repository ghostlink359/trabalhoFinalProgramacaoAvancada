package view;

import javax.swing.*;
import model.Mapa;

public class TelaMapa extends JFrame {

    public TelaMapa(Mapa mapa) {

        setTitle("Visualização de Mapa");
        setSize(700,500);
        setLocationRelativeTo(null);

        JLabel titulo =
                new JLabel(
                        mapa.getNome()
                );

        titulo.setHorizontalAlignment(
                SwingConstants.CENTER
        );

        ImageIcon imagem =
                new ImageIcon("mapa.jpg");

        JLabel lblImagem =
                new JLabel(imagem);

        add(titulo, "North");
        add(lblImagem, "Center");

        setVisible(true);
    }
}