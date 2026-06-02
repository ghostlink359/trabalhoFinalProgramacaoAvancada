package model;

public class Admin extends Usuario {

    public Admin(String nome, String login, String senha) {
        super(nome, login, senha);
    }

    public void gerenciarSistema() {
        System.out.println("Administrador gerenciando o sistema.");
    }
}