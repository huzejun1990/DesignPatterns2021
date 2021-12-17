package com.dream.db.ASM;

import org.objectweb.asm.ClassWriter;

import static aj.org.objectweb.asm.Opcodes.*;
import static jdk.internal.org.objectweb.asm.Opcodes.ACC_ABSTRACT;

/**
 * @Author : huzejun
 * @Date: 2021/12/17-23:13
 */
public class ClassWriteTest {
    public static void main(String[] args) {
        ClassWriter cw = new ClassWriter(0);
        cw.visit(V1_5,ACC_PUBLIC + ACC_ABSTRACT,
                "pkg/Comparable",null,"java/lang/Object",
                null);
        cw.visitField(ACC_PUBLIC + ACC_FINAL + ACC_STRICT,"LESS","I",
                null,-1).visitEnd();
        cw.visitField(ACC_PUBLIC + ACC_FINAL + ACC_STRICT,"EQUAL","I",
                null,0).visitEnd();
        cw.visitField(ACC_PUBLIC + ACC_FINAL + ACC_STRICT,"GREATER","I",
                null,1).visitEnd();
        cw.visitField(ACC_PUBLIC + ACC_FINAL + ACC_STRICT,"compareTo",
                "(Ljava/lang/Objcet;)I",null,null).visitEnd();
        cw.visitEnd();
        byte[] b = cw.toByteArray();
        MyClassLoader myClassLoader = new MyClassLoader();
        Class c = myClassLoader.defineClass("pkg.Comparable",b);
        System.out.println(c.getMethods()[0].getName());
    }
}
