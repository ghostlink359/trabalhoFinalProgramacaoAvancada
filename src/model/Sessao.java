package model;

public class Sessao {

    private Usuario usuarioLogado;

    public Sessao(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }

    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public void encerrarSessao() {
        usuarioLogado = null;
    }
}