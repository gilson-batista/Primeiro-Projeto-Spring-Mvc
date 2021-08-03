package com.company;

public class Noh<T> {
    private T conteudo;
    private Noh proxNoh;

    public Noh(T conteudo) {
        this.conteudo = conteudo;
    }

    public Noh(Noh proxNoh) {
        this.proxNoh = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public Noh getProxNoh() {
        return proxNoh;
    }

    public void setProxNoh(Noh proxNoh) {
        this.proxNoh = proxNoh;
    }

    @Override
    public String toString() {
        return "Noh{" +
                "conteudo=" + conteudo +
                '}';
    }
}
