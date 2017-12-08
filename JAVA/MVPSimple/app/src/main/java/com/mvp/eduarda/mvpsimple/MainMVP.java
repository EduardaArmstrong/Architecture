package com.mvp.eduarda.mvpsimple;

/**
 * Created by Eduarda on 01/12/2017.
 */

public interface MainMVP {

    interface View{
        void updateValor(int num);

    }

    interface Presenter{
        void clickBotao();

    }

    interface Model{

        int somar();

    }
}
