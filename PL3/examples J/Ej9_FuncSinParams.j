.source Main.java
.class public Ej9_FuncSinParams
.super java/lang/Object

.method public <init>()V
  .limit stack 1
  .limit locals 1
  aload_0
  invokenonvirtual java/lang/Object/<init>()V
  return
.end method

.method public static hola()V
  .limit stack  32
  .limit locals 32

  getstatic java/lang/System/out Ljava/io/PrintStream;
  ldc "Hola funcion"
  invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

  return
.end method

.method public static main([Ljava/lang/String;)V
  .limit stack  32
  .limit locals 32

  invokestatic Ej9_FuncSinParams/hola()V

  return
.end method
