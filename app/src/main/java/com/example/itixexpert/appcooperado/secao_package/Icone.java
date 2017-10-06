package com.example.itixexpert.appcooperado.secao_package;

/**
 * Created by itix.expert on 05/10/2017.
 */

public class Icone {
    private long id;
    private String valor;

    public Icone() {
    }

    public Icone(long id, String valor) {
        this.id = id;
        this.valor = valor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
