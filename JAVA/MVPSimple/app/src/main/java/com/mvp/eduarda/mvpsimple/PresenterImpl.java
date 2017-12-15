package com.mvp.eduarda.mvpsimple;

/**
 * Created by Eduarda on 01/12/2017.
 */

public class PresenterImpl  implements MainMVP.Presenter{

    private MainMVP.View view;
    private ModelImpl model;
    private int soma = 0;
    private String resultadoBusca;

    public PresenterImpl(MainMVP.View view , Preferences preferences) {
        this.view = view;
        this.model = new ModelImpl(preferences);

    }

    @Override
    public void clickBotaoSomar() {
       soma =  model.somar();
       view.updateValor(String.valueOf(soma));
    }

    @Override
    public void clickBotaoSalvar(String valor) {
        model.salvar(valor);
    }

    @Override
    public void clickBotaoZerar() {
        model.zerar();
        resultadoBusca = model.recuperarValor();
        view.updateValor(resultadoBusca);
    }

    @Override
    public void buscaValor() {
        resultadoBusca = model.recuperarValor();
        view.updateValor(resultadoBusca);

    }


}
