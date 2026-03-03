.source Main.java
.class public Ej12_FuncVariosParams
.super java/lang/Object

.method public <init>()V
  .limit stack 1
  .limit locals 1
  aload_0
  invokenonvirtual java/lang/Object/<init>()V
  return
.end method

.method public static suma(II)I
  .limit stack  32
  .limit locals 32   ; 0 = a, 1 = b

  iload_0
  iload_1
  iadd
  ireturn
.end method

.method public static main([Ljava/lang/String;)V
  .limit stack  32
  .limit locals 32

  bipush 5
  bipush 8
  invokestatic Ej12_FuncVariosParams/suma(II)I
  istore_0

  getstatic java/lang/System/out Ljava/io/PrintStream;
  iload_0
  invokevirtual java/io/PrintStream/println(I)V

  return
.end method
