package view;

import javax.swing.*;

public class TelaPrincipal extends JFrame {

    private JButton btnUsuarios;
    private JButton btnMapa;
    private JButton btnSair;

    public TelaPrincipal() {

        setTitle("Sistema GIS");
        setSize(600,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        btnUsuarios =
                new JButton("Cadastrar Usuário");

        btnMapa =
                new JButton("Visualizar Mapa");

        btnSair =
                new JButton("Sair");

        btnUsuarios.setBounds(180,80,220,40);
        btnMapa.setBounds(180,140,220,40);
        btnSair.setBounds(180,200,220,40);

        add(btnUsuarios);
        add(btnMapa);
        add(btnSair);

        btnSair.addActionListener(e ->
                System.exit(0));

        setVisible(true);
    }
}