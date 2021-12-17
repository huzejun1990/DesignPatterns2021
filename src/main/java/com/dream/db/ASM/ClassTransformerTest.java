package com.dream.db.ASM;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.objectweb.asm.Opcodes.ASM4;
import static org.objectweb.asm.Opcodes.INVOKESTATIC;

/**
 * @Author : huzejun
 * @Date: 2021/12/17-23:43
 */
public class ClassTransformerTest {
   public static void main(String[] args) throws Exception {
   ClassReader cr = new ClassReader(
            ClassPrinter.class.getClassLoader().getResourceAsStream("com/dream/db/ASM/Tank.java"));

      ClassWriter cw = new ClassWriter(0);
      ClassVisitor cv = new ClassVisitor(ASM4, cw) {
         @Override
         public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
            MethodVisitor mv = super.visitMethod(access,name,descriptor,signature,exceptions);
            // return mv;
            return new MethodVisitor(ASM4,mv) {
               @Override
               public void visitCode() {
                  visitMethodInsn(INVOKESTATIC,"com/dream/db/ASM/TimeProxy.java","before","()V",false);
                  super.visitCode();
               }
            };
         }
      };
      cr.accept(cv,0);
      byte[] b2 = cw.toByteArray();

      MyClassLoader c1 = new MyClassLoader();
      c1.loadClass("com.dream.db.ASM.TimeProxy");
      Class c2 = c1.defineClass("com.dream.db.ASM.Tank",b2);
      c2.getConstructor().newInstance();

      String path = (String) System.getProperties().get("user.dir");
      File f = new File(path + "/com/dream/db/ASM/");
      f.mkdirs();

      FileOutputStream fos = new FileOutputStream(new File(path + "/com/dream/dp/ASM/Tank_0.class"));
      fos.write(b2);
      fos.flush();
      fos.close();

   }

   }
