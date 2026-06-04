package view;

import dao.UsuarioDAO;
import model.Usuario;

import javax.swing.*;
import java.util.List;

public class TelaListaUsuarios extends JFrame {

    public TelaListaUsuarios(UsuarioDAO usuarioDAO) {

        setTitle("Lista de Usuários");
        setSize(400,300);
        setLocationRelativeTo(null);

        JTextArea area = new JTextArea();

        List<Usuario> usuarios =
                usuarioDAO.listar();

        for (Usuario u : usuarios) {

            area.append(
                    "Nome: " + u.getNome()
                    + " | Login: "
                    + u.getLogin()
                    + "\n"
            );
        }

        add(new JScrollPane(area));

        setVisible(true);
    }
}