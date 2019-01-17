package com.example.a38012.myapplication;

import android.app.Application;
import android.content.Context;


/**
 * Created by wanglei on 2016/12/31.
 */

public class App extends Application {
    private App() {}

    private static App context = null;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

    public static Context getContext() {
        return context;
    }

    public static Context getInstance() {

        synchronized(App.class){
            if(context == null){
                context = new App();
            }
        }
        return context;
    }

}
