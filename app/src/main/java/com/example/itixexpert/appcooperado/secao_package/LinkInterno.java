package com.example.itixexpert.appcooperado.secao_package;

import java.util.ArrayList;

/**
 * Created by itix.expert on 05/10/2017.
 */

public class LinkInterno {
    private String url;
    private ArrayList<String> parametros;

    public LinkInterno() {
        parametros = new ArrayList<>();
    }

    public LinkInterno(String url, ArrayList<String> parametros) {
        this.url = url;
        this.parametros = parametros;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ArrayList<String> getParametros() {
        return parametros;
    }

    public void setParametros(ArrayList<String> parametros) {
        this.parametros = parametros;
    }
}
