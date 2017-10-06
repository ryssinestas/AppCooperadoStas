package com.example.itixexpert.appcooperado.secao_package;

/**
 * Created by itix.expert on 05/10/2017.
 */

public class Secao {

    protected long id;
    protected long idPai;
    protected String tipo;
    protected String titulo;
    protected String subTitulo;
    protected String linkExterno;
    protected LinkInterno linkInterno; // ex: Parametros = [ 'crm' ]
    String estiloListagem; // 'imgInicio' ou 'semImg' ou 'imgFim'
    String estiloDetalhe; // 'imgInicio' ou 'semImg' ou 'imgFim'
    protected Card card;
    protected Menu menu;
}
