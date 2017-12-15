package com.mvp.eduarda.mvpsimple;

import android.app.Application;
import android.content.Context;
import android.preference.Preference;

/**
 * Created by Eduarda on 09/12/2017.
 */

public class MVPSimples extends Application {

    private static MVPSimples singleton;
    private static Preferences preferences;

    public MVPSimples() {}

    public Preferences getPreferences(){
        if(preferences == null){
            preferences = new Preferences(singleton) ;
        }
        return preferences;
    }

    public static MVPSimples getInstance(){
         return singleton;
     }

    @Override
    public void onCreate() {
        super.onCreate();
        singleton = this;

    }


}
