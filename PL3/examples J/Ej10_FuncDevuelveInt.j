.source Main.java
.class public Ej10_FuncDevuelveInt
.super java/lang/Object

.method public <init>()V
  .limit stack 1
  .limit locals 1
  aload_0
  invokenonvirtual java/lang/Object/<init>()V
  return
.end method

.method public static suma()I
  .limit stack  32
  .limit locals 32

  iconst_2
  iconst_3
  iadd
  ireturn
.end method

.method public static main([Ljava/lang/String;)V
  .limit stack  32
  .limit locals 32

  invokestatic Ej10_FuncDevuelveInt/suma()I
  istore_0

  getstatic java/lang/System/out Ljava/io/PrintStream;
  iload_0
  invokevirtual java/io/PrintStream/println(I)V

  return
.end method
