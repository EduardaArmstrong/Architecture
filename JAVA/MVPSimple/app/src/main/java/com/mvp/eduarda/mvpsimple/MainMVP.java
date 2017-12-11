package com.mvp.eduarda.mvpsimple;

/**
 * Created by Eduarda on 01/12/2017.
 */

public interface MainMVP {

    interface View{
        void updateValor(String num);
    }

    interface Presenter{
        void clickBotaoSomar();
        void clickBotaoSalvar(String valor);
        void clickBotaoZerar();
        void buscaValor();

    }

    interface Model{
        int somar();
        void salvar(String valor);
        void zerar();
        String recuperarValor();

    }
}
