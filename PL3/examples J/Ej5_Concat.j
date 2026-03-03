.source Main.java
.class public Ej5_Concat
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

  ; int x = 42;
  bipush 42
  istore_0

  ; new StringBuilder()
  new java/lang/StringBuilder
  dup
  invokenonvirtual java/lang/StringBuilder/<init>()V

  ; append("Resultado: ")
  ldc "Resultado: "
  invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;

  ; append(x)
  iload_0
  invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;

  ; toString()
  invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;

  ; println
  getstatic java/lang/System/out Ljava/io/PrintStream;
  swap
  invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

  return
.end method
