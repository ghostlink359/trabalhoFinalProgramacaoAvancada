package main;

import dao.UsuarioDAO;
import model.Admin;
import service.LoginService;
import view.TelaLogin;

public class Main {

    public static void main(String[] args) {

        UsuarioDAO usuarioDAO =
                new UsuarioDAO();

        usuarioDAO.salvar(
                new Admin(
                        "Administrador",
                        "admin",
                        "123"
                )
        );

        LoginService loginService =
                new LoginService(usuarioDAO);

        new TelaLogin(loginService);
    }
}