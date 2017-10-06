package com.example.itixexpert.appcooperado.secao_package;

/**
 * Created by itix.expert on 05/10/2017.
 */

public class Menu {
    private boolean ativo;
    private Icone icone;

    public Menu() {
    }

    public Menu(boolean ativo, Icone icone) {
        this.ativo = ativo;
        this.icone = icone;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Icone getIcone() {
        return icone;
    }

    public void setIcone(Icone icone) {
        this.icone = icone;
    }
}
