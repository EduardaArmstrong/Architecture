package com.mvp.eduarda.mvpsimple;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Eduarda on 11/12/2017.
 */

public class Preferences {

    private SharedPreferences sharedPreferences;
    private static final String ARQUIVO_VALOR = "ArquivoValor";

    public Preferences(Context context) {
        sharedPreferences = context.getSharedPreferences(ARQUIVO_VALOR,Context.MODE_PRIVATE);
    }

    public void salvar(String key , String valor){

        sharedPreferences.edit()
                .putString(key, valor)
                .commit();

    }

    public String buscar(String key){

        String valor = sharedPreferences.getString(key,"");

        if(valor == null || valor.isEmpty()){
            valor = "0";
        }
        return valor;

    }

}

