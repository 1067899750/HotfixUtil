package com.example.hotfixutil;


import android.util.Log;

public class Utils {
    private static final String TAG = "Utils";

    public static void test() {
        Log.d(TAG, "xxxxx");
       throw new IllegalStateException("出错啦！！！！！！！！！！！！！！");
    }

}
