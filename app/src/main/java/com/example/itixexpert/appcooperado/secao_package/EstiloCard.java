package com.example.itixexpert.appcooperado.secao_package;

/**
 * Created by itix.expert on 05/10/2017.
 */

public class EstiloCard {
    private String cor;
    private String corDeFundo;
    private int tamanho;
    private String posicao;

    public EstiloCard() {
    }

    public EstiloCard(String cor, String corDeFundo, int tamanho, String posicao) {
        this.cor = cor;
        this.corDeFundo = corDeFundo;
        this.tamanho = tamanho;
        this.posicao = posicao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCorDeFundo() {
        return corDeFundo;
    }

    public void setCorDeFundo(String corDeFundo) {
        this.corDeFundo = corDeFundo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
}
