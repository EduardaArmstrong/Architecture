package com.mvp.eduarda.mvpsimple;

/**
 * Created by Eduarda on 01/12/2017.
 */

public class ModelImpl implements MainMVP.Model {

    private int soma ;
    private String valor;
    MVPSimples mvpSimples = new MVPSimples();

    private static final String ARQUIVO_VALOR = "ArquivoValor";
    Arquivo arquivo = new Arquivo(mvpSimples.getInstance().getSharedPreferences(ARQUIVO_VALOR ,0));

    @Override
    public int somar() {

        soma = soma +1;
        return soma;
    }

    @Override
    public void salvar(String valor) {

        arquivo.salvar("number", valor);
    }

    @Override
    public void zerar() {
        arquivo.salvar("number", "0");

    }

    @Override
    public String recuperarValor() {
        valor = arquivo.buscar("number");
        soma = Integer.parseInt(valor);
        return valor;
    }
}
