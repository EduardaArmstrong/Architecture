package com.mvp.eduarda.mvpsimple;

/**
 * Created by Eduarda on 01/12/2017.
 */

public class ModelImpl implements MainMVP.Model {

    private int soma ;
    private String valor;
    private MVPSimples mvpSimples = new MVPSimples() ;
    private Preferences preferences = mvpSimples.getPreferences();

    @Override
    public int somar() {

        soma = soma +1;
        return soma;
    }

    @Override
    public void salvar(String valor) {

        preferences.salvar("number", valor);
    }

    @Override
    public void zerar() {
        preferences.salvar("number", "0");

    }

    @Override
    public String recuperarValor() {
        valor = preferences.buscar("number");
        soma = Integer.parseInt(valor);
        return valor;
    }
}
