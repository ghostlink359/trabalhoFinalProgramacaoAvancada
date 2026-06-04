package view;

import dao.UsuarioDAO;
import javax.swing.*;
import model.Mapa;

public class TelaPrincipal extends JFrame {

    private JButton btnUsuarios;
    private JButton btnMapa;
    private JButton btnSair;
    private JButton btnListar;
    private JButton btnArquivoGIS;

    private UsuarioDAO usuarioDAO;

    public TelaPrincipal(UsuarioDAO usuarioDAO) {

        this.usuarioDAO = usuarioDAO;

        setTitle("Sistema GIS");
        setSize(600,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        btnUsuarios = new JButton("Cadastrar Usuário");
        btnListar = new JButton("Listar Usuários");
        btnArquivoGIS = new JButton("Carregar Arquivo GIS");
        btnMapa = new JButton("Visualizar Mapa");
        btnSair = new JButton("Sair");
        
        btnUsuarios.setBounds(180,60,220,40);
        btnMapa.setBounds(180,110,220,40);
        btnArquivoGIS.setBounds(180,160,220,40);
        btnListar.setBounds(180,210,220,40);
        btnSair.setBounds(180,260,220,40);

        add(btnUsuarios);
        add(btnMapa);
        add(btnSair);
        add(btnListar);
        add(btnArquivoGIS);

        btnUsuarios.addActionListener(e ->
                new TelaCadastroUsuario(usuarioDAO)
        );

        btnMapa.addActionListener(e -> {

            Mapa mapa = new Mapa(
                    "Mapa do Paraná",
                    "Curitiba"
            );

            new TelaMapa(mapa);
        });
        
        btnListar.addActionListener(e ->
        new TelaListaUsuarios(usuarioDAO)
        );

        btnSair.addActionListener(e ->
                System.exit(0));

        setVisible(true);

        btnArquivoGIS.addActionListener(e -> {

    JFileChooser chooser =
            new JFileChooser();

    int retorno =
            chooser.showOpenDialog(null);

    if(retorno ==
            JFileChooser.APPROVE_OPTION){

        JOptionPane.showMessageDialog(
                null,
                "Arquivo carregado:\n"
                + chooser
                .getSelectedFile()
                .getAbsolutePath()
                );
            }
        });
    }
}