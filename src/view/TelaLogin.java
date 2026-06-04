package view;

import exception.LoginInvalidoException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import model.Usuario;
import service.LoginService;

public class TelaLogin extends JFrame {

    private JTextField txtLogin;
    private JPasswordField txtSenha;
    private JButton btnEntrar;

    private LoginService loginService;

    public TelaLogin(LoginService loginService) {

        this.loginService = loginService;

        setTitle("Sistema GIS - Login");
        setSize(400,250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblLogin = new JLabel("Login:");
        lblLogin.setBounds(50,50,80,25);

        txtLogin = new JTextField();
        txtLogin.setBounds(130,50,180,25);

        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setBounds(50,90,80,25);

        txtSenha = new JPasswordField();
        txtSenha.setBounds(130,90,180,25);

        btnEntrar = new JButton("Entrar");
        btnEntrar.setBounds(130,140,100,30);

        add(lblLogin);
        add(txtLogin);
        add(lblSenha);
        add(txtSenha);
        add(btnEntrar);

        btnEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    Usuario usuario =
                            loginService.autenticar(
                                    txtLogin.getText(),
                                    new String(txtSenha.getPassword())
                            );

                    JOptionPane.showMessageDialog(
                            null,
                            "Bem-vindo " + usuario.getNome()
                    );

                    dispose();

                    new TelaPrincipal(
                        loginService.getUsuarioDAO()
                    );

                } catch (LoginInvalidoException ex) {

                    JOptionPane.showMessageDialog(
                            null,
                            ex.getMessage()
                    );
                }
            }
        });

        setVisible(true);
    }
}