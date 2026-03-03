.source Main.java
.class public Ej6_IfAnidados
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

  ; int x = 5;
  iconst_5
  istore_0

  ; int y = 10;
  bipush 10
  istore_1

  ; if (x < y)
  iload_0
  iload_1
  if_icmpge L_END_ALL   ; si x >= y salimos

  ; System.out.println("x<y");
  getstatic java/lang/System/out Ljava/io/PrintStream;
  ldc "x<y"
  invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

  ; if (y < 20)
  iload_1
  bipush 20
  if_icmpge L_END_ALL   ; si y >= 20 salimos

  getstatic java/lang/System/out Ljava/io/PrintStream;
  ldc "y<20"
  invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

L_END_ALL:
  return
.end method
