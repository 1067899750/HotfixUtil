package com.example.hotfixutil;

import android.app.Application;
import android.content.Context;

import com.example.patch_lib.EnjoyFix;

import java.io.File;

/**
 * @author puyantao
 * @description :
 * @date 2022/3/26
 */
public class MyApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        EnjoyFix.installPatch(this, new File("/sdcard/patch.jar"));
    }
}


