package view;

import model.Mapa;

import javax.swing.*;

public class TelaMapa extends JFrame {

    private JTextArea area;

    public TelaMapa(Mapa mapa) {

        setTitle("Visualização de Mapa");
        setSize(500,300);
        setLocationRelativeTo(null);

        area = new JTextArea();

        area.setText(
                "Mapa: " + mapa.getNome()
                + "\nRegião: "
                + mapa.getRegiao()
        );

        add(new JScrollPane(area));

        setVisible(true);
    }
}