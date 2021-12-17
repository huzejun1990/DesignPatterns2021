package com.dream.db.ASM;

/**
 * @Author : huzejun
 * @Date: 2021/12/17-23:28
 */
public class MyClassLoader extends ClassLoader{

    public Class defineClass(String name, byte[] b){
        return defineClass(name,b,0,b.length);
    }
}
