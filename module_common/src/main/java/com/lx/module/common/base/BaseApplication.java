package com.lx.module.common.base;

import android.app.Application;

/**
 * Created by lixiang on 2018/12/9.<br/>
 * 所有组件的Application都必须继承该类
 */
public class BaseApplication extends Application {
    private static Application sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = (Application) getApplicationContext();
    }

    public static Application getInstance() {
        return sInstance;
    }
}
