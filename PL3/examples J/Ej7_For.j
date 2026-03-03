.source Main.java
.class public Ej7_For
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

  ; int i = 0;
  iconst_0
  istore_0

L_FOR_COND:
  iload_0
  iconst_5
  if_icmpge L_FOR_END

  ; cuerpo: System.out.println(i);
  getstatic java/lang/System/out Ljava/io/PrintStream;
  iload_0
  invokevirtual java/io/PrintStream/println(I)V

  ; i++
  iinc 0 1
  goto L_FOR_COND

L_FOR_END:
  return
.end method
