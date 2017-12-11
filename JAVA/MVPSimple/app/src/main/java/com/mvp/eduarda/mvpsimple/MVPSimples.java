package com.mvp.eduarda.mvpsimple;

import android.app.Application;
import android.content.Context;

/**
 * Created by Eduarda on 09/12/2017.
 */

public class MVPSimples extends Application {

    private static MVPSimples singleton;

     public MVPSimples getInstance(){
         return singleton;
     }

    @Override
    public void onCreate() {
        super.onCreate();
        singleton = this;

    }


}
