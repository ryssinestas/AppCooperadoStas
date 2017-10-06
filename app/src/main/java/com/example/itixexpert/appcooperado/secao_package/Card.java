package com.example.itixexpert.appcooperado.secao_package;

import java.util.ArrayList;

/**
 * Created by itix.expert on 05/10/2017.
 */

public class Card {
    private boolean ativo;
    private EstiloCard estiloCard;
    private String img;
    ArrayList<String> classesCSS;

    public Card() {
    }

    public Card(boolean ativo, EstiloCard estiloCard, String img, ArrayList<String> classesCSS) {
        this.ativo = ativo;
        this.estiloCard = estiloCard;
        this.img = img;
        this.classesCSS = classesCSS;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public EstiloCard getEstiloCard() {
        return estiloCard;
    }

    public void setEstiloCard(EstiloCard estiloCard) {
        this.estiloCard = estiloCard;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public ArrayList<String> getClassesCSS() {
        return classesCSS;
    }

    public void setClassesCSS(ArrayList<String> classesCSS) {
        this.classesCSS = classesCSS;
    }
}
