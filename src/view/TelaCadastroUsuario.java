package view;

import dao.UsuarioDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import model.Usuario;

public class TelaCadastroUsuario extends JFrame {

    private JTextField txtNome;
    private JTextField txtLogin;
    private JTextField txtSenha;

    private JButton btnCadastrar;

    public TelaCadastroUsuario(UsuarioDAO usuarioDAO) {

        setTitle("Cadastro de Usuário");
        setSize(400,300);
        setLayout(null);
        setLocationRelativeTo(null);

        txtNome = new JTextField();
        txtNome.setBounds(120,40,200,25);

        txtLogin = new JTextField();
        txtLogin.setBounds(120,80,200,25);

        txtSenha = new JTextField();
        txtSenha.setBounds(120,120,200,25);

        btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setBounds(120,180,120,30);

        JLabel lblNome = new JLabel("Nome");
        lblNome.setBounds(40,40,80,25);

        JLabel lblLogin = new JLabel("Login");
        lblLogin.setBounds(40,80,80,25);

        JLabel lblSenha = new JLabel("Senha");
        lblSenha.setBounds(40,120,80,25);

        add(lblNome);
        add(lblLogin);
        add(lblSenha);

        add(txtNome);
        add(txtLogin);
        add(txtSenha);
        add(btnCadastrar);

        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Usuario usuario =
                        new Usuario(
                                txtNome.getText(),
                                txtLogin.getText(),
                                txtSenha.getText()
                        );

                usuarioDAO.salvar(usuario);

                JOptionPane.showMessageDialog(
                        null,
                        "Usuário cadastrado!"
                );
            }
        });

        setVisible(true);
    }
}