package dao;

import java.util.ArrayList;
import java.util.List;

import model.Usuario;

public class UsuarioDAO {

    private List<Usuario> usuarios;

    public UsuarioDAO() {
        usuarios = new ArrayList<>();
    }

    public void salvar(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Usuario> listar() {
        return usuarios;
    }

    public Usuario buscarPorLogin(String login) {

        for (Usuario usuario : usuarios) {

            if (usuario.getLogin().equals(login)) {
                return usuario;
            }

        }

        return null;
    }
}