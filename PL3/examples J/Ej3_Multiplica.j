.source Main.java
.class public Ej3_Multiplica
.super java/lang/Object

.method public <init>()V
  .limit stack 1
  .limit locals 1
  aload_0
  invokenonvirtual java/lang/Object/<init>()V
  return
.end method

.method public static main([Ljava/lang/String;)V
  .limit stack  32
  .limit locals 32

  ; int a = 6;
  bipush 6
  istore_0

  ; int b = 7;
  bipush 7
  istore_1

  ; int r = a * b;
  iload_0
  iload_1
  imul
  istore_2

  ; System.out.println(r);
  getstatic java/lang/System/out Ljava/io/PrintStream;
  iload_2
  invokevirtual java/io/PrintStream/println(I)V

  return
.end method
