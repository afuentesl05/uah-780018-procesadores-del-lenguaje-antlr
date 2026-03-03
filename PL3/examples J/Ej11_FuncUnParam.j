.source Main.java
.class public Ej11_FuncUnParam
.super java/lang/Object

.method public <init>()V
  .limit stack 1
  .limit locals 1
  aload_0
  invokenonvirtual java/lang/Object/<init>()V
  return
.end method

.method public static cuadrado(I)I
  .limit stack  32
  .limit locals 32   ; local 0 = x

  iload_0
  iload_0
  imul
  ireturn
.end method

.method public static main([Ljava/lang/String;)V
  .limit stack  32
  .limit locals 32

  bipush 7
  invokestatic Ej11_FuncUnParam/cuadrado(I)I
  istore_0

  getstatic java/lang/System/out Ljava/io/PrintStream;
  iload_0
  invokevirtual java/io/PrintStream/println(I)V

  return
.end method
