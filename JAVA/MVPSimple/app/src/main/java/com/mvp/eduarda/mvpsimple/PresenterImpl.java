package com.mvp.eduarda.mvpsimple;

/**
 * Created by Eduarda on 01/12/2017.
 */

public class PresenterImpl  implements MainMVP.Presenter{

    private  MainMVP.View view;
    private  ModelImpl model;
    private int soma = 0;

    public PresenterImpl(MainMVP.View view) {
        this.view = view;
        this.model = new ModelImpl();
    }

    @Override
    public void clickBotao() {

       soma =  model.somar();

        view.updateValor(soma);

    }


}
