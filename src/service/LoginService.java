package service;

import dao.UsuarioDAO;
import exception.LoginInvalidoException;
import model.Usuario;

public class LoginService {

    private UsuarioDAO usuarioDAO;

    public LoginService(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    public Usuario autenticar(
            String login,
            String senha)
            throws LoginInvalidoException {

        Usuario usuario =
                usuarioDAO.buscarPorLogin(login);

        if (usuario == null) {

            throw new LoginInvalidoException(
                    "Usuário não encontrado.");
        }

        if (!usuario.getSenha().equals(senha)) {

            throw new LoginInvalidoException(
                    "Senha incorreta.");
        }

        return usuario;
    }
}