package com.mvp.eduarda.mvpsimple;

import android.content.SharedPreferences;

/**
 * Created by Eduarda on 08/12/2017.
 */

public class Arquivo {
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;


    public Arquivo() {
    }

    public Arquivo(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
        this.editor = this.sharedPreferences.edit();
    }

    public void salvar(String key , String valor){
        this.editor.putString(key, valor);
        this.editor.commit();

    }

    public String buscar(String key){
     return this.sharedPreferences.getString(key,"");
    }
}
