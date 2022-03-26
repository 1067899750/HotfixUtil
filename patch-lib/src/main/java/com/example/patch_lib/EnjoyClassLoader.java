package com.example.patch_lib;

import dalvik.system.PathClassLoader;

/**
 * @author puyantao
 * @description : 自定义 ClassLoader
 * @date 2022/3/26
 */
public class EnjoyClassLoader extends PathClassLoader {
    public EnjoyClassLoader(String dexPath, ClassLoader parent) {
        super(dexPath, parent);
    }

    public EnjoyClassLoader(String dexPath, String librarySearchPath, ClassLoader parent) {
        super(dexPath, librarySearchPath, parent);
    }
}

