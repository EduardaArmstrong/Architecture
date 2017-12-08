package com.mvp.eduarda.mvpsimple;

/**
 * Created by Eduarda on 01/12/2017.
 */

public class ModelImpl implements MainMVP.Model{

    int soma = 0;

    @Override
    public int somar() {
        soma = soma +1;

        return soma;
    }
}
